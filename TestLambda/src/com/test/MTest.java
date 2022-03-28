package com.test;

public class MTest {
	// 함수 인터페이스: 하나의 인터페이스 구현이 필요한 메소드를 1개만 가지는 원형으로 선언하여 변수처럼 어딘가에 할당시키거나 다른 메소드들에 변수를 이용해서 
	// 					값을 전달하는 것과 동일한 형태로 전달될 수 있는 간단한 식
	
	@FunctionalInterface	// 람다식을 위한 익명함수 형식 표현
	private interface My_Function { // 함수 인터페이스
		public void say(String name);// 추상메소드 '하나'만 선언
	}

	public static void main(String[] args) {
		// 1. 실행할 코드를 작성
		My_Function func = (myName) -> System.out.println("Hello, " + myName);
		
		// 2. 메소드 호출해서 값 대입
		func.say("Dominica_kim");
		func.say("Dominica_Ji");
	}
}
