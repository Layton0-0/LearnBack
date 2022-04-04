package my.com.member.validator;

import java.util.regex.Pattern;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class JoinFormValidator implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		// 유효성 검사를 하는 대상 클래스
		return JoinForm.class.equals(clazz); // 회원가입 폼에서 가로채기를 해서 대상값을 받아서 검증
	}

	@Override
	public void validate(Object target, Errors errors) {
		// 검증 시작하면서 오류가 있으면 Error의 객체로 값을 출력한다.
		
		JoinForm form = (JoinForm) target;
		// 1. 아이디 존재 유무

		// 2. 가입한 비밀번호 8글자 이상, 숫자 영문자, 특수 문자 조합인지 아닌지등등 . _프론트에서 처리
		// 영숫자 제외한 것을 특수문자로 간주 한다면
		boolean fw = Pattern.matches("(?=.*[a-zA-Z])(?=.*[0-9])(?=.*[^a-zA-Z0-9ㄱ-ㅎ]).{8,}", form.getPassword());
		if (!fw) {
			errors.rejectValue("password", " error-password", "비밀번호8자리 이상 ");
		}
		// 3. 전화번호 유효한지 (9~ 11자리 안한지) , 실명인증

		fw = Pattern.matches("^\\d{9,11}$", form.getTell());
		if (!fw) {
			errors.rejectValue("tell", " error-tell", "전화번호 9~11자리");
		}

		
	}
	
}
