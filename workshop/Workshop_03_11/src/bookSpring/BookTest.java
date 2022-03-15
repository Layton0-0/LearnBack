package bookSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BookTest {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("bookSpring/applicationContext.xml");
		System.out.println("책이름\t\t 가격\t\t할인율\t 할인후금액");
		System.out.println("-----------------------------------------------");
		
		Book book = ac.getBean("sqlPlus", Book.class);
		System.out.println(book);
		
		book = ac.getBean("java", Book.class);
		System.out.println(book);
		
		book = ac.getBean("jsp", Book.class);
		System.out.println(book);
		
	}

}
