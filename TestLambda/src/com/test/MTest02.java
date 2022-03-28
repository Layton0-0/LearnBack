package com.test;

public class MTest02 {
	@FunctionalInterface
	interface Func{
		public int calc(int a, int b);
	}
	
	public static void main(String[] args) {
		Func add = (int a, int b) -> {
			return a + b;
		};
		Func add02 = (int a, int b) -> {
			System.out.println("a= " + a + " b=" + b);
			return a + b;
		};
		Func sub = (int a, int b) -> a - b;
		Func doub = (a, b) -> a * b;
		Func div = (a, b) -> a / b;
		
		System.out.println(add02.calc(100, 50));
		System.out.println(sub.calc(200, 50));
		System.out.println(doub.calc(200, 50));
		System.out.println(div.calc(200, 50));
	}
}
