package com.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

// 1. 배열과 객체들의 목록들을 stream으로 변환해서 출력해보자.
public class Test {
	public static void main(String[] args) {

		List<String> list = Arrays.asList("사원1", "사원2", "사원3", "사원4");
		
		String[] array = { "관리자1", "관리자 2", "관리자 3", "관리자 4" };

		Stream<String> stream1 = list.stream();// (1)리스트를 스트림으로
		Stream<String> stream2 = Arrays.stream(array); // (2) 배열을 스트림으로
		Stream<String> stream3 = Stream.of("1", "2", "3", "4"); // (3) 래퍼형 of()를 이용해서 스트림으로
		Stream<String> stream4 = Stream.of(array); // (3) 래퍼형 of()를 이용해서 스트림으로
		// (5) 1, 2, 3, 4, 5 숫자를 스트림으로 출력해보다.
		Stream<Integer> stream5 = Stream.of(1, 2, 3, 4, 5);

		// Stream 출력
		PrintStream(stream1);
		PrintStream(stream2);
		PrintStream(stream3);
		PrintStream(stream4);
		PrintStream02(stream5);
	}

	private static void PrintStream(Stream<String> m_stream) {
		m_stream.forEach(e -> System.out.printf("%5s", e));
		System.out.println("\n============================");
	}
	
	private static void PrintStream02(Stream<Integer> m_stream) {
		m_stream.forEach(e -> System.out.printf("%5d", e));
		System.out.println("\n============================");
	}
}
