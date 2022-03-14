package student;

public class Student {
	String name;
	int korean;
	int english;
	int math;
	int science;
	
	public Student() {
		super();
	}

	public Student(String name, int korean, int english, int math, int science) {
		this.name = name;
		this.korean = korean;
		this.english = english;
		this.math = math;
		this.science = science;
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

	public int getSum() {
		int sum = korean+english+math+science;
		return sum;
	}

	public double getAvg() {
		double avg = 0;
		avg = getSum() / 4.0;
		return avg;
	}
	
	public String getGrade() {
		if (getAvg() <= 100 && getAvg() >= 90) {
			return "A학점";
		} else if (getAvg() < 90 && getAvg() >= 70) {
			return "B학점";
		} else if (getAvg() < 70 && getAvg() >= 50) {
			return "C학점";
		} else if (getAvg() < 50 && getAvg() >= 30) {
			return "D학점";
		} else {
			return "F학점";
		}
	}
}