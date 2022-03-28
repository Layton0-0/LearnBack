package com.test01;

import java.util.function.*;
//3. java.util.function.Predicate 실습

public class MTest02 {
	public static void main(String[] args) {
		// boolean test(T t) : 문자열을 받아서 길이가 10보다 크면 true/false
		Predicate<String> i = (s) -> s.length() > 10; // (1)
		System.out.println(i.test("Getting Start Java"));// (2)

		/*
		 * interface Predicate { public boolean test(String ); } class i implements
		 * Predicate {
		 * 
		 * @Override public boolean test(String s){ return s.length() >10; }
		 */
		IntPredicate p1 = n -> (n % 3) == 0; // (3) 3으로 나눈 나머지가 0이면 true, false
		IntPredicate p2 = n -> (n % 5) == 0; // (4) 5로 나눈 나머지가 0이면 true, false
		IntPredicate p_res = p1.and(p2); // (5) p1의 결과와 p2의 결과를 && 논리연산 결과로...

		System.out.println(p_res.test(3)); // (6) true && false => false
		System.out.println(p_res.test(4)); // (7)

		IntPredicate p_res02 = p1.or(p2); // (8) ||로 리턴
		System.out.println(p_res02.test(5));
		System.out.println(p_res02.test(15));

		Predicate<String> str = Predicate.isEqual("Dominica_kim"); // (9)
		System.out.println(str.test("Dominica_kim"));
		
		BiPredicate<Integer, Integer> bi = (x, y) -> x > y;
		// (10) 5 > 7
		System.out.println(bi.test(5, 7));

	}
}
