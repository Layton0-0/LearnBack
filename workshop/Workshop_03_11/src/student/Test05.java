package student;

public class Test05 {

	public static void main(String[] args) {
		Student std1 = new Student("Kim", 100, 90, 95, 89);
		Student std2 = new Student("Lee", 60, 70, 99, 98);
		Student std3 = new Student("Park", 68, 86, 60, 40);
		
		System.out.println(std1.getName() + " 평균:" + std1.getAvg() + " 학점:" + std1.getGrade() + "학점");
		System.out.println(std2.getName() + " 평균:" + std2.getAvg() + " 학점:" + std2.getGrade() + "학점");
		System.out.println(std3.getName() + " 평균:" + std3.getAvg() + " 학점:" + std3.getGrade() + "학점");

	}

}
