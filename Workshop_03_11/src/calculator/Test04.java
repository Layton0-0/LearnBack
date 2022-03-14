package calculator;

import java.util.*;

public class Test04 {

	public static void main(String[] args) {
		int a, b, c, d;
		int sum = 0;
		double avg = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("입력 데이터 예: ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		
		Calc calc = new Calc();
		sum = calc.calcSum(a, b, c, d);
		avg = calc.calcAvg(sum, 4);
		
		System.out.println("Sum:"+sum);
		System.out.println("Avg:"+avg);
		System.out.println(calc.showGrade(avg)+"학점");
		
		
		sc.close();

	}

}
