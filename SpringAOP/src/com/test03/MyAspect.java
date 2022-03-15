package com.test03;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {

//	public void 형의 com.test03안의 모든 클래스 안의 모든 메소드
	@Before("execution(public void com.test03.*.*(..))")
	public void before(JoinPoint joinPoint) {
		System.out.println("노트북 줌 로그인 후 실행한다. 출석 체크");
	}

	@AfterThrowing(pointcut = "execution(public void com.test03.*.*(..))", throwing = "e")
	public void throwing(JoinPoint joinPoint, Throwable e) {
		System.out.println("멀티캠퍼스 공사하는 날: " + e);
	}

	@After("execution(public * *(..))")
	public void after(JoinPoint joinPoint) {
		System.out.println("로그아웃한다.");
	}

}
