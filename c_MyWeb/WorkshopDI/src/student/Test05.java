package student;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test05 {

	public static void main(String[] args) {
		// student ��ü�� 3�� �����Ѵ�.
		// ������ ��ü�� ��հ� ������ ȭ�鿡 ��� �Ѵ�.

		ApplicationContext apct =new ClassPathXmlApplicationContext("student/applicationContext.xml");
		Student std = apct.getBean("std", Student.class);
		Student std2 = apct.getBean("std2", Student.class);
		Student std3 = apct.getBean("std3", Student.class);

		System.out.print(std.getName());
		System.out.printf(" ���: " + std.getAvg());
		System.out.printf(" ����: " + std.getGrade() + "%n");

		System.out.print(std2.getName());
		System.out.printf(" ���: " + std2.getAvg());
		System.out.printf(" ����: " + std2.getGrade() + "%n");

		System.out.print(std3.getName());
		System.out.printf(" ���: " + std3.getAvg());
		System.out.printf(" ����: " + std3.getGrade() + "%n");
	}

}
