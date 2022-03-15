package calculator;

public class Calc {

	public Calc() {
		super();
	}

	public int calcSum(int a, int b, int c, int d) {
		int sum = a + b + c + d;
		return sum;
	}
	
	public double calcAvg(int sum, int count) {
		double avg = (double)sum / count;
		return avg;
	}
	
	public String showGrade(double avg) {
		String grade;
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

}
