package sample3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Sample3_MTest {
	public static void main(String[] args) {
		
		ApplicationContext factory
		= new ClassPathXmlApplicationContext("sample3/applicationContext.xml");
		
		UserVo res = (UserVo) factory.getBean("mvo");
		System.out.println(res.getMy_date());
		System.out.println(res.getPer());
		
	}

}
