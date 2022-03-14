package student;

public class Test5_1 {

	public static void main(String[] args) {
		// student 객체를 3개 생성한다.
		// 각각의 객체의 평균과 학점을 화면에 출력 한다.

		Student kim = new Student();
		Student lee = new Student();
		Student park = new Student();

		kim.setName("Kim");
		kim.setKorean(100);
		kim.setEnglish(90);
		kim.setMath(95);
		kim.setScience(89);

		lee.setName("Lee");
		lee.setKorean(60);
		lee.setEnglish(70);
		lee.setMath(99);
		lee.setScience(98);

		park.setName("Park");
		park.setKorean(68);
		park.setEnglish(86);
		park.setMath(60);
		park.setScience(40);

		System.out.print(kim.getName());
		System.out.printf(" 평균: " + kim.getAvg());
		System.out.printf(" 학점: " + kim.getGrade() + "%n");

		System.out.print(lee.getName());
		System.out.printf(" 평균: " + lee.getAvg());
		System.out.printf(" 학점: " + lee.getGrade() + "%n");

		System.out.print(park.getName());
		System.out.printf(" 평균: " + park.getAvg());
		System.out.printf(" 학점: " + park.getGrade() + "%n");

	}

}
