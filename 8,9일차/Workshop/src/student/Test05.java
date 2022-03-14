package student;

public class Test05 {

	public static void main(String[] args) {
		// student 객체를 3개 생성한다.
		// 각각의 객체의 평균과 학점을 화면에 출력 한다.

		Student[] student = new Student[3];
		student[0] = new Student("Kim", 100, 90, 95, 89);
		student[1] = new Student("Lee", 60, 70, 99, 98);
		student[2] = new Student("Park", 68, 86, 60, 40);

		System.out.print(student[0].getName());
		System.out.printf(" 평균: " + student[0].getAvg());
		System.out.printf(" 학점: " + student[0].getGrade() + "%n");

		System.out.print(student[1].getName());
		System.out.printf(" 평균: " + student[1].getAvg());
		System.out.printf(" 학점: " + student[1].getGrade() + "%n");

		System.out.print(student[2].getName());
		System.out.printf(" 평균: " + student[2].getAvg());
		System.out.printf(" 학점: " + student[2].getGrade() + "%n");
	}

}
