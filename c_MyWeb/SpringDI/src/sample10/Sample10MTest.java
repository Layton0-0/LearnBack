package sample10;

import java.sql.*;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Sample10MTest {

	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("sample10/applicationContext.xml");
		
		MemberDAO memberDao = factory.getBean("memberDAO", MemberDAO.class);
		MemberDTO m = new MemberDTO("111", "222", "333");
		
		int r;
		try {
			r = memberDao.getInsert(m);
			if(r > 0) {
				System.out.println("입력 성공입니다");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}// catch
		

	}//main

}//class
