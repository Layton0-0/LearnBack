package calculator;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// �հ���� ����
		Calc calc = new Calc();
		int sum = calc.CalcSum(scan.nextInt(), scan.nextInt(), scan.nextInt(), scan.nextInt());
		double avg = 0;

		System.out.printf("Sum:" + sum + "%n");

		// ������ ����
		avg = (double) sum / 4;
		System.out.printf("Avg:" + avg + "%n");

		// ������� ����
		if (90 <= avg) {
			System.out.println("A����");
		} else if (70 <= avg) {
			System.out.println("B����");
		} else if (50 <= avg) {
			System.out.println("C����");
		} else if (30 <= avg) {
			System.out.println("D����");
		} else {
			System.out.println("F����");
		}

		scan.close();

	}

}
