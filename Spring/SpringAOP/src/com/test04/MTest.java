package com.test04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {

	public static void main(String[] args) {
		// 1. context load
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/test04/beans.xml");
		
		// 3. student 
		Person p = ac.getBean("student", Person.class);
		// 4. 메소드를 실행.
		p.classWork();
		
		System.out.println("=============================");
		
		p = ac.getBean("g7", Person.class);
		p.classWork();
		
		((AbstractApplicationContext) ac).close();

	}

}
