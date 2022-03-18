package test01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mtest01 {
	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("test01/applicationContext.xml");
		
		FirstJdbcDao dao = (FirstJdbcDao)factory.getBean("test");
		int count = dao.insert("p0004", "스프링", 45000, "SDS");
		System.out.println(count + "행의 데이터가 입력되었습니다");
		
		dao.execute("select * from goodsinfo");
		System.out.println("=======================");
		int r = dao.delete("스프링");
		dao.execute("select * from goodsinfo");
		
		((AbstractApplicationContext) factory).close();
	}
}
