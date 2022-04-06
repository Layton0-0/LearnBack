package com.web.resolver;

import com.web.annotation.SocialUser;
import com.web.domain.User;
import com.web.domain.enums.SocialType;
import com.web.repository.UserRepository;

import org.springframework.core.MethodParameter;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;


import static com.web.domain.enums.SocialType.GOOGLE;

// 프로젝트 로딩하기 전에 사용자 MVC 패턴 이벤트가 연동되는 부분으로 addArgumentResolver로
// List<HandlerMethodArgumentResolver>의 타입을 추가적으로 관리한다.

// 사용자 계정 관리/ 권한 관리 (페이지 권한, 계정 권한 분류)

// !! 어플리케이션을 진입점에서 실행하는데 HandlerMethodArgumentResolver를 통해 메소드를 실행하겠다.
// 	-> 해당 요청 웹페이지에서 구글의 아이디와 비번을 권한된 인증으로 접속한 후 그 값을 세션에 기록시키겠다.
// main -> 기본 Id 정보 한줄, 게시판 10줄 -> UserArgumentResolver(세션 + user테이블에 저장)
@Component
public class UserArgumentResolver implements HandlerMethodArgumentResolver {

    private UserRepository userRepository;

    public UserArgumentResolver(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override // true / false 결과에 따라 resolveArgument 메소드를 실행시킨다.
    public boolean supportsParameter(MethodParameter parameter) {
        return parameter.getParameterAnnotation(SocialUser.class) != null && parameter.getParameterType().equals(User.class);
    }
    
    // ()매개 인자의 객체 값에 따라 객체 참조 및 바인딩을 시켜준다.
    @Override
    public Object resolveArgument(MethodParameter parameter, ModelAndViewContainer mavContainer, NativeWebRequest webRequest, WebDataBinderFactory binderFactory) {
        // 세션 기록 + DB 기록
    	// 세션의 객체를 RequestContextHolder로 찾아온다.
    	HttpSession session = ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes()).getRequest().getSession();
        User user = (User) session.getAttribute("user");
        return getUser(user, session);
    }

    private User getUser(User user, HttpSession session) {
        if(user == null) {
            try {
            	// 구글 사이트에서 인증받은 값을 담을 객체를 리턴받는다.
                OAuth2AuthenticationToken authentication = (OAuth2AuthenticationToken) SecurityContextHolder.getContext().getAuthentication();
                // 속성 (키와 값을 받는다.)
                Map<String, Object> map = authentication.getPrincipal().getAttributes();
                // client-id를 통해 구글 계정으로 접속한 정보를 convertUser에 대입
                User convertUser = convertUser(authentication.getAuthorizedClientRegistrationId(), map);

                user = userRepository.findByEmail(convertUser.getEmail()); // 구글 계정이 있는지 db에서 찾아서 리턴
                if (user == null) { user = userRepository.save(convertUser); } // db에 없으면 저장해라

                setRoleIfNotSame(user, authentication, map); // 혹시나 인증된 권한이 없을 경우 다른 타입으로 기본값 지정 
                session.setAttribute("user", user); // 세션에 담아라.
            } catch (ClassCastException e) {
                return user;
            }
        }
        return user;
    }

    private User convertUser(String authority, Map<String, Object> map) {       
      if(GOOGLE.isEquals(authority)) return getModernUser(GOOGLE, map);       
        return null;
    }
    
    // 구글 계정 접속한 정보를 객체로 담아서 리턴
    private User getModernUser(SocialType socialType, Map<String, Object> map) {
        return User.builder()
                .name(String.valueOf(map.get("name")))
                .email(String.valueOf(map.get("email")))
                .pincipal(String.valueOf(map.get("id")))
                .socialType(socialType)
                .createdDate(LocalDateTime.now())
                .build();
    }
  
    // 권한 체크하는 테스트용
    private void setRoleIfNotSame(User user, OAuth2AuthenticationToken authentication, Map<String, Object> map) {
        if(!authentication.getAuthorities().contains(new SimpleGrantedAuthority(user.getSocialType().getRoleType()))) {
            SecurityContextHolder.getContext().setAuthentication(new UsernamePasswordAuthenticationToken(map, "N/A", AuthorityUtils.createAuthorityList(user.getSocialType().getRoleType())));
        }
    }
}