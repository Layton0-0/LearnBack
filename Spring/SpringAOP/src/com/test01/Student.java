package com.test01;

public class Student {
	public void classWork() {
		System.out.println("노트북 줌 로그인 후 실행한다. 출석 체크");
		try {
			// 핵심로직
			System.out.println("[학생]들은 회의실에 참여하고 줌 공유하고 수업을 듣는다.");
		} catch(Exception e) {
			System.out.println("멀티캠퍼스 공사하는 날");
		} finally {
			System.out.println("퇴실카드 체크.");
		}
		System.out.println("로그아웃한다.");
	}
}
