package student;

public class Student {
	private String name;
	private int korean;
	private int english;
	private int math;
	private int science;
	
	public Student() {
		super();
	}

	public Student(String name, int korean, int english, int math, int science) {
		super();
		this.name = name;
		this.korean = korean;
		this.english = english;
		this.math = math;
		this.science = science;
	}
	
	public double getAvg() {
		double avg = (korean + english + math + science) / 4.0;
		return avg;
	}
	
	public String getGrade() {
		double avg = (korean + english + math + science) / 4.0;
		String grade = "";
		if(avg <= 100 && avg >= 90) {
			grade = "A";			
		} else if(avg < 90 && avg >= 70) {
			grade = "B";
		} else if(avg < 70 && avg >= 50) {
			grade = "C";
		} else if(avg < 50 && avg >= 30) {
			grade = "D";
		} else {
			grade = "F";
		}
		return grade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKorean() {
		return korean;
	}

	public void setKorean(int korean) {
		this.korean = korean;
	}

	public int getEnglish() {
		return english;
	}

	public void setEnglish(int english) {
		this.english = english;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getScience() {
		return science;
	}

	public void setScience(int science) {
		this.science = science;
	}
	
	
}
