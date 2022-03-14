package com.sample3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Sample3_MTest {

	public static void main(String[] args) {
		ApplicationContext ac = 
			      new ClassPathXmlApplicationContext("com/sample3/applicationContext.xml");
		
		UserVo uv01 = (UserVo) ac.getBean("mvo");
		System.out.println(uv01.getMy_date());
		System.out.println(uv01.getPer());
		
		
	}

}
