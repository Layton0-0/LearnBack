package com.test01;

public class G7Class {
	public void classWork() {
		System.out.println("노트북 줌 로그인 후 실행한다. 출석 체크");
		try {
			// 핵심로직
			System.out.println("[강사]는 회의실을 열고 줌 수업을 진행한다.");
		} catch(Exception e) {
			System.out.println("멀티캠퍼스 공사하는 날");
		} finally {
			System.out.println("퇴실카드 체크.");
		}
		System.out.println("로그아웃한다.");
	}
}
