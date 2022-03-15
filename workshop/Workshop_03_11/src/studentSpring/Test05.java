package studentSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test05 {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("studentSpring/applicationContext.xml");
		Student std = ac.getBean("kim", Student.class);		
		System.out.println(std);
		
		std = ac.getBean("lee", Student.class);
		System.out.println(std);
		
		std = ac.getBean("park", Student.class);
		System.out.println(std);

	}

}
