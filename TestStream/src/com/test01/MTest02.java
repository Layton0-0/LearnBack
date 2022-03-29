package com.test01;

import java.util.stream.Stream;

// 4. generate / iterate(T, UnaryOperator)
public class MTest02 {
	public static void main(String[] args) {
		Stream<String> stream1 = Stream.generate(() -> "A");
		stream1.limit(10).forEach(System.out::println);
		
		Stream<Integer> stream2 = Stream.iterate(1, i -> ++i);
		stream2.limit(10).forEach(System.out::println);
	}
}
