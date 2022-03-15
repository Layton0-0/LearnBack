package com.test01.Anno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//1. application load
public class MTest { // 8. 프로그램의 진입점
	public static void main(String[] args) {
		
		// 2. context load: beans.xml을 생성객체로 메모리에 로드된 주소를 context변수에 대입
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"com/test01/Anno/beans.xml"});
		
		// 9. 등록된 빈 팩토리의 객체 중 MyTest라는 빈<bean/>을 호출한다.
		NicNamePrn prn = context.getBean("MyTest", NicNamePrn.class);
		System.out.println(prn);
		
		((AbstractApplicationContext) context).refresh();
	}
}
