package student;

public class Test05 {

	public static void main(String[] args) {
		// student ��ü�� 3�� �����Ѵ�.
		// ������ ��ü�� ��հ� ������ ȭ�鿡 ��� �Ѵ�.

		Student[] student = new Student[3];
		student[0] = new Student("Kim", 100, 90, 95, 89);
		student[1] = new Student("Lee", 60, 70, 99, 98);
		student[2] = new Student("Park", 68, 86, 60, 40);

		System.out.print(student[0].getName());
		System.out.printf(" ���: " + student[0].getAvg());
		System.out.printf(" ����: " + student[0].getGrade() + "%n");

		System.out.print(student[1].getName());
		System.out.printf(" ���: " + student[1].getAvg());
		System.out.printf(" ����: " + student[1].getGrade() + "%n");

		System.out.print(student[2].getName());
		System.out.printf(" ���: " + student[2].getAvg());
		System.out.printf(" ����: " + student[2].getGrade() + "%n");
	}

}
