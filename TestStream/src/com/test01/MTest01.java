package com.test01;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

// 2. 처리계 탐색용 주요 메소드를 활용해보자. ( 참 거짓으로 반환 )
// 3. 처리계 집계용 주요 메소드를 활용해보자.
public class MTest01 {
	public static void main(String[] args) {
		List<String> str = Arrays.asList("샤인머스켓", "멜론", "수박", "딸기", "참외", "감", "키위", "바나나", "두리안");
		List<String> str01 = Arrays.asList("멜론", "수박", "딸기", "참외", "키위");
		// (1) 딸기 있지? -> anyMatch: stream의 요소 중에 하나라도 참을 반환하면 참.
		System.out.println(str.stream().anyMatch(s -> s.equals("딸기")));
		// (2) 포도 없지? -> noneMatch: stream의 요소 전부 false를 반환해야 참.
		System.out.println(str.stream().noneMatch(s -> s.equals("포도")));
		// (3) 과일 길이가 전부 두글자니? / 세글자니? -> allMatch
		System.out.println(str.stream().allMatch(s -> s.length() == 3));
		System.out.println(str01.stream().allMatch(s -> s.length() == 2));

		// (4) list객체의 래퍼형 데이터의 개수
		System.out.println(IntStream.of(1, 2, 3, 4, 5, 6, 7).count());
		// (5) list객체의 래퍼형 데이터의 합
		System.out.println(IntStream.of(1, 2, 3, 4, 5, 6, 7).sum());
		// (6) list객체의 래퍼형 데이터의 평균
		System.out.println(IntStream.of(1, 2, 3, 4, 5, 6, 7).average());

	}
}
