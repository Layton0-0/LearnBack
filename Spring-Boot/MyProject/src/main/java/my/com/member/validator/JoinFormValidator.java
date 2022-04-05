package my.com.member.validator;

import java.util.regex.Pattern;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import my.com.member.MemberRepository;

@Component
public class JoinFormValidator implements Validator {

	private final MemberRepository memberRepository;

	public JoinFormValidator(MemberRepository memberRepository) {
		this.memberRepository = memberRepository;
	}

// supports(Class<?> clazz)  
// ->  validate(Object target (Input = JoinForm ), Errors errors(Output_대상필드, 오류 메시지) )
// 만일에  supports메소드에서 대상을 지정하지 않으면 validate(Object target)의  폼 객체를  다 적용하겠다. 

	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub 유효성 검사를 하는 대상 클래스
		// th:object="${joinForm}"
		return JoinForm.class.equals(clazz); // 회원가입폼에서 가로채기를 해서 대상값을 받아서 검증
	}

	@Override
	public void validate(Object target, Errors errors) {
		JoinForm form = (JoinForm) target;		
		//1. 아이디 존재 유무
		
		//2. 비밀번호가 8글자 이상, 숫자 영문자 특수문자 조합인지 확인
		boolean valid = Pattern.matches("(?=.*[a-zA-Z])(?=.*[0-9])(?=.*[^a-zA-Zㄱ-힣0-9]).{8,}", form.getPassword());
		if(!valid) {
			errors.rejectValue("password", "error-password", "비밀번호는 8글자 이상의 숫자 영문자 특수문자 조합 입니다.");
		}
		
		//3. 전화번호가 9~11자리의 숫자
		valid = Pattern.matches("^\\d{9,11}$", form.getTell());
		if(!valid) {
			errors.rejectValue("tell", "error-tell", "전화번호는 9~11자리의 숫자입니다.");
		}
	}

}
