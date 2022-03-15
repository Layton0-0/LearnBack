package com.test02;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

// invoke()라는 재정의 메소드를 통해서 가로채기한 메소드를 실행하고 리턴하는 인터페이스
// <property name="advice" ref="myAdvice"></property>
public class MyAspect implements MethodInterceptor {
	
	// 8. 가로챈 메소드를 가지고 invoke가 실행된다.
	@Override
	public Object invoke(MethodInvocation i) throws Throwable {

		System.out
				.println("method " + i.getMethod() + " is called on " + i.getThis() + " with args " + i.getArguments());
		Object res = null;
		System.out.println("노트북 줌 로그인 후 실행한다. 출석 체크");
		try {
			// 핵심로직
			res = i.proceed(); // G7Class, Student classWork() 가로채기해서 실행
		} catch (Exception e) {
			System.out.println("멀티캠퍼스 공사하는 날");
		} finally {
			System.out.println("퇴실카드 체크.");
		}
		System.out.println("로그아웃한다.");
		System.out.println("method "+i.getMethod()+" returns "+res);
		return res;
	}

}
