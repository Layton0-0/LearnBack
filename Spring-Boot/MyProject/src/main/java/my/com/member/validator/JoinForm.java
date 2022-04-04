package my.com.member.validator;

import lombok.Data;
import my.com.entity.Member;

@Data
public class JoinForm {
	private String userId;
	private String password;
	private String tell;
	private String email;
	
	// 테스트 검증용 메소드: 입력된 데이터를 사용하는 객체를 멤버 테이블로 전달
	public Member ConvertToMember() {
		Member member = new Member();
		member.setUserId(userId);
		member.setPassword(password);
		member.setTell(tell);
		member.setEmail(email);
		return member;
	}
}
