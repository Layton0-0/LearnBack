package calculator;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// 합계출력 로직
		Calc calc = new Calc();
		int sum = calc.CalcSum(scan.nextInt(), scan.nextInt(), scan.nextInt(), scan.nextInt());
		double avg = 0;

		System.out.printf("Sum:" + sum + "%n");

		// 평균출력 로직
		avg = (double) sum / 4;
		System.out.printf("Avg:" + avg + "%n");

		// 학점출력 로직
		if (90 <= avg) {
			System.out.println("A학점");
		} else if (70 <= avg) {
			System.out.println("B학점");
		} else if (50 <= avg) {
			System.out.println("C학점");
		} else if (30 <= avg) {
			System.out.println("D학점");
		} else {
			System.out.println("F학점");
		}

		scan.close();

	}

}
