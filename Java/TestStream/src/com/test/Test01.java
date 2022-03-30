package com.test;

import java.util.Arrays;

public class Test01 {
	public static void main(String[] args) {
		Integer[] array = { 1, 2, 3, 4, 5, 4, 3, 3, 5, 2, 3, 5, 9 };
		System.out.println("1) filter를 이용해서 짝수만 출력해보자.");
		// boolean test(T)
		Arrays.stream(array).filter(v -> v % 2 == 0).forEach(System.out::println);
		System.out.println();

		System.out.println("2) limit 메소드 3개의 요소만 출력 ----");
		Arrays.stream(array).limit(3).forEach(value -> System.out.println("limitStream: " + value));
		System.out.println();

		System.out.println("3) distinct 메소드로 중복 제거 ----");
		Arrays.stream(array).distinct().forEach(System.out::println);
	}
}
