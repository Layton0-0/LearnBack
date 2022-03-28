package com.test;

public class MTest01 {
// 2. 함수형 인터페이스 매개인자를 다루어보자. 6) 람다식 표현식
	
	@FunctionalInterface
	interface Func01{
		public String Prn(String name); // 매개인자 있는 경우
	}
	@FunctionalInterface
	interface Func02{
		public String Prn02(); // 매개인자가 없는 경우
	}
	public static void main(String[] args) {
		Func01 mName = name -> "hi! " + name; // (name)에서 ()을 생략
		System.out.println(mName.Prn("Yoon"));
		
		Func02 mTest = () -> "lambda Test!!"; // {} 생략, return 생략
		System.out.println(mTest.Prn02());
		
		Func02 mTest02 = () -> {return "lambda Test02!!";}; // {} 생략, return 생략
		System.out.println(mTest02.Prn02());
	}
}
