package com.test01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest01 {

	public static void main(String[] args) {
	
		 ApplicationContext context 
		 = new ClassPathXmlApplicationContext("com/test01/application.xml");
		  U_Collection    u =  context.getBean("u_ctn", U_Collection.class);
		  System.out.println(u.toString());
		 
		 ((AbstractApplicationContext) context).close();
	}
}

