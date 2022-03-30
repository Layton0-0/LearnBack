package com.test01;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

// 1. min, max reduce 처리를 확인해보자.
public class MTest {
	public static void main(String[] args) {
		List<String> str = Arrays.asList("샤인머스켓", "멜론", "수박", "딸기", "참외", "감");
		Optional<String> minRes = str.stream().min(Comparator.naturalOrder());
		Prn(minRes);
		
		Optional<String> maxRes = str.stream().max(Comparator.naturalOrder());
		Prn(maxRes);
	}

	private static void Prn(Optional<String> d) {
		if(d.isPresent()) { // 값이 있으면
			System.out.println(d.get()); // 값을 가져다 전달, 출력.
		} else {
			System.out.println("invalid value"); // 없으면 에러문구 출력.
		}
		
	}
}
