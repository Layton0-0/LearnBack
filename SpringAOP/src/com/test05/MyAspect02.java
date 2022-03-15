package com.test05;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.annotation.After;

// 환경설정으로 호출(beans.xml <aop:>로 선언)
public class MyAspect02 {

	public void before(JoinPoint joinPoint) {
		System.out.println("노트북 줌 로그인 후 실행한다. 출석 체크");
	}

	public void After(JoinPoint joinPoint) {
		System.out.println("로그아웃한다.");
	}

}
