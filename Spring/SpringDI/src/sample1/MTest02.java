package sample1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest02 {

	public static void main(String[] args) {
		
		ApplicationContext ac = 
				new ClassPathXmlApplicationContext("sample1/applicationContext.xml");
		MessageImpl bean = ac.getBean("mi",MessageImpl.class);
		bean.sayHello();
		
		bean = ac.getBean("mi02",MessageImpl.class);
		bean.sayHello();
	}

}
