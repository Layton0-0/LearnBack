package my.com.common.code;

// 스프링 부트 시큐리티용 + OAuth2 개념을 설계하는 기본 속성값
//  enum 연관된 상수들의 집합  / class로 내부 관리된다.  
public enum MemberGrade {
	//ME00의 정보가 C이고 연장가능이 1이 라고 간주하자.
	
	// ME00("C", 1)  
	//-> public static final MemberGrade ME00 = new MemberGrade("C",1);
	
	
	//회원의 등급	
	ME00("C", "user", 1), 
	ME01("B", "user", 2),
	ME02("A", "user", 3),
	ME03("VIP",  "user", 4),
	
	//관리자 등급 
	AD00("super",  "admin", 9999), //수퍼 관리자.   
	AD01("member", "admin", 9999), // 회원 관리자.  
	AD02("board",  "admin", 9999); //게시판 관리자.  
	
	public final String DESC;
	public final String ROLE;
	public final int EXTENDABLE_CNT;
	
	private MemberGrade(String desc, String role, int extendableCnt) {
		this.DESC = desc;
		this.ROLE = role;
		this.EXTENDABLE_CNT = extendableCnt;
	}	
}
