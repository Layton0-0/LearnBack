package com.test04;

import org.aspectj.lang.JoinPoint;

public class MyAspect {

	public void before(JoinPoint joinPoint) {
		System.out.println("노트북 줌 로그인 후 실행한다. 출석 체크");
	}

	public void throwing(JoinPoint joinPoint, Throwable e) {
		System.out.println("멀티캠퍼스 공사하는 날: " + e);
	}

	public void After(JoinPoint joinPoint) {
		System.out.println("로그아웃한다.");
	}

}
