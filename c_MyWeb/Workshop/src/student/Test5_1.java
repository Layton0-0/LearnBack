package student;

public class Test5_1 {

	public static void main(String[] args) {
		// student ��ü�� 3�� �����Ѵ�.
		// ������ ��ü�� ��հ� ������ ȭ�鿡 ��� �Ѵ�.

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
		System.out.printf(" ���: " + kim.getAvg());
		System.out.printf(" ����: " + kim.getGrade() + "%n");

		System.out.print(lee.getName());
		System.out.printf(" ���: " + lee.getAvg());
		System.out.printf(" ����: " + lee.getGrade() + "%n");

		System.out.print(park.getName());
		System.out.printf(" ���: " + park.getAvg());
		System.out.printf(" ����: " + park.getGrade() + "%n");

	}

}
