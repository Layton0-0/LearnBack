package workshop;

public class Test02 {

	public static void main(String[] args) {

		// �迭�� �ε����� Ȧ����°�� ��
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
