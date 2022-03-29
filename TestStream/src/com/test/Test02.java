package com.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// 3. 중간처리 중 map, peek, collect 등의 메소드를 활용해보자.
// <R> Stream<R>	flatMap(Function<? super T,? extends Stream<? extends R>> mapper)
public class Test02 {
	public static void main(String[] args) {

		Stream<String> stream = Stream.of("Java", "jsp", "spring", "jquery");
		// (1) map: 다른값 또는 다른 형태로 변환하는 기능을 가진 메소드
		// 스트림 대상값을 대문자의 요소로 변환
		stream.map(s -> s.toUpperCase()).forEach(System.out::println);
		System.out.println("========================");

		// (2) peek()메소드는 요소의 개수에 전혀 영향을 주지 않는다.
		Stream<String> stream01 = Stream.of("루리", "루세", "루오", "폴리");
		stream01.peek(t -> System.out.printf("디버깅용 체크값=%s%n", t)).map(t -> t + "\n").forEach(System.out::println);

		List<String> list = Arrays.asList("멜론5팩", "딸기1팩", "감귤3팩");
		/* 
		 	(3) flatMap 메소드 복수개의 값을 반환하는 함수를 사용하는 map이다.
		 	String = char[] = " " / substring(), Arrays.fill()
		 	
		 	Arrays.fill(arr, c)로 문자열만 추출 -> c에 대입 
		 	객체 문자열의 숫자만 추출 -> arr변수(반복 횟수로 구현할 배열의 객체)에 대입했다.
		 	
		 	Stream.of(arr)로 리턴한 것을 collect(Collectors.toList())로 List변환해서 result변수를 통해 출력했다.
		 */
		List<String> result = list.stream().flatMap(s -> { // list를 stream으로 변환함.
			String c = s.substring(0, 2); // 저장할 과일 이름 추출
			int n = Integer.parseInt(s.substring(2, 3)); // 숫자 추출(반복 횟수)
			String[] arr = new String[n]; // 몇번 쓸지는 n이 정하고
			Arrays.fill(arr, c); // 정해진 모든 칸에 대입.
			return Stream.of(arr); // 스트림으로 변환해서 리턴.
		}).collect(Collectors.toList()); // 다시 리스트로 변환해서 result에 저장.
		System.out.println(result); // result출력
	}
}
