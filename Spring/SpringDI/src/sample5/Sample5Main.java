package sample5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Sample5Main {

	public static void main(String[] args) {

		ApplicationContext factory = new ClassPathXmlApplicationContext("com/sample5/applicationContext.xml");
		
		System.out.println("Spring IOC 컨테이너 초기화 후...");
		
		TV tv = factory.getBean("samsung", TV.class);
		
		tv.powerOn();
		tv.volumnUp();
		tv.volumnDown();
		tv.powerOff();
	}

}
