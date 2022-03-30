package com.exam;

@FunctionalInterface
interface DoInterface{ // 함수형 인터페이스
	void doSomething(); // 추상메소드는 반드시 하나만 선언되어야 한다.
}

public class Ex01 {
	private int classField = 0;
	private static int staticField = 0;
	
	private void Process() {
		System.out.println("Before: classField = " + classField);
		System.out.println("Before: staticField = " + staticField);
		DoInterface test = () -> { // 명령 코드를 작성하는 부분, void doSomething();
			classField++; // <- 이 변수를 처리할 수 있습니다.
			staticField++; // <- 이 변수를 처리할 수 있습니다.
		};
		test.doSomething(); // 처리를 실행
		System.out.println("After: classField = " + classField);
		System.out.println("After: staticField = " + staticField);
		System.out.println();
	}
	public static void main(String[] args) {
		for(int i = 0; i <= 3; i++) {
			new Ex01().Process();
		}
	}// end main
}// end class
