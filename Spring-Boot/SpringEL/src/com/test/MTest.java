package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {

	public static void main(String[] args) {
		 ApplicationContext context 
		 = new ClassPathXmlApplicationContext("com/test/beans.xml");
		    Person  obj = (Person) context.getBean("my_person");
		    System.out.println(obj);
		    
	}

}
