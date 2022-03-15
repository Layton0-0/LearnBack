package com.test03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;


public class MTest {
	public static void main(String[] args) {
		
		// 1. context 로드
		ApplicationContext ctx = new AnnotationConfigApplicationContext();
		((AnnotationConfigApplicationContext) ctx).register(AppConfig.class);
		// dependOn같은거 있으면 꼭 refresh를 해줘야 함.
		((AbstractApplicationContext) ctx).refresh();
		
		School st = ctx.getBean("school", School.class);		
		System.out.println(st.toString());
		((AbstractApplicationContext) ctx).close();

	}

}
