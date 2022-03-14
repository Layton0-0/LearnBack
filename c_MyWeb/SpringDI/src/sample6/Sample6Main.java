package sample6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Sample6Main {
	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("sample6/applicationContext.xml");
		Foo obj = (Foo) factory.getBean("fooTest");
		obj.fooMethod();
	}
}
