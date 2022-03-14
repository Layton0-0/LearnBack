package student;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test05 {

	public static void main(String[] args) {
		// student 객체를 3개 생성한다.
		// 각각의 객체의 평균과 학점을 화면에 출력 한다.

		ApplicationContext apct =new ClassPathXmlApplicationContext("student/applicationContext.xml");
		Student std = apct.getBean("std", Student.class);
		Student std2 = apct.getBean("std2", Student.class);
		Student std3 = apct.getBean("std3", Student.class);

		System.out.print(std.getName());
		System.out.printf(" 평균: " + std.getAvg());
		System.out.printf(" 학점: " + std.getGrade() + "%n");

		System.out.print(std2.getName());
		System.out.printf(" 평균: " + std2.getAvg());
		System.out.printf(" 학점: " + std2.getGrade() + "%n");

		System.out.print(std3.getName());
		System.out.printf(" 평균: " + std3.getAvg());
		System.out.printf(" 학점: " + std3.getGrade() + "%n");
	}

}
