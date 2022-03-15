package workshop;

public class Test02 {

	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		int sum = 0;
		
		for(int i = 1; i < arr.length; i+=2) {
			sum += arr[i];
		}
		
		System.out.println("sum=" + sum);

	}

}
