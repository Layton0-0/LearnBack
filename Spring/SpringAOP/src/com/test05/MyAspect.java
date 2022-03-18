package com.test05;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.aspectj.lang.annotation.After;

// 애노테이션으로 호출한 것
@Component("myAdvice")
@Aspect
public class MyAspect {
	@Pointcut("execution(* classWork())")
	private void myClass() {} // 규칙: private, {}비어있어야 하고, ()매개 인자가 메소드와 같아야 함.
	
	@Before("myClass()")
	public void before(JoinPoint joinPoint) {
		System.out.println("노트북 줌 로그인 후 실행한다. 출석 체크");
	}
	
	@After("myClass()")
	public void After(JoinPoint joinPoint) {
		System.out.println("로그아웃한다.");
	}

}
