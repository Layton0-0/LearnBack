package workshop;

public class Test01 {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		int sum = 0, avg = 0;

		for (int a : arr) {
			sum += a;
		}
		avg = sum / arr.length;

		System.out.println("sum=" + sum);
		System.out.println("avg=" + avg);
	}

}
