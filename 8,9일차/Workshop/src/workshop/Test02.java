package workshop;

public class Test02 {

	public static void main(String[] args) {

		// 배열의 인덱스의 홀수번째의 합
		int[] arr = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };

		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			if (i % 2 != 0) {
				sum = sum + arr[i];
			}
		}
		System.out.println("sum=" + sum);

	}

}
