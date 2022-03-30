package com.test01;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// 5. groupingBy, joining
public class MTest03 {
	public static void main(String[] args) {
		// (1) groupingBy
		Stream<String> s = Stream.of("땅이", "바다", "계곡", "게임", "애니", "놀이동산", "맛집탐방", "수영장");
		Map<Integer, List<String>> res = s.collect(Collectors.groupingBy(word -> word.length()));
		System.out.println(res);
		
		// (2) joining 조건에 따라 그룹핑하는 코드: 길이에 따라 그룹핑을 하되 조인한 결과
		// Collectors.groupingBy(word -> word.length() **조건, Collectors.joining() **데이터형태)
		Stream<String> s1 = Stream.of("땅이", "바다", "계곡", "게임", "애니", "놀이동산", "맛집탐방", "수영장");
		Map<Integer, String> res1 = s1.collect(Collectors.groupingBy(word -> word.length(), Collectors.joining())); //  -> 길이를 기준으로 그룹핑
		System.out.println(res1);
		
		// (2) TreeMap joining 조건에 따라 그룹핑하는 코드: 길이에 따라 그룹핑을 하되 조인한 결과
		// Collectors.groupingBy(word -> word.length() **조건,**리턴타입, Collectors.joining() **데이터형태)
		Stream<String> s2 = Stream.of("땅이", "바다", "계곡", "게임", "애니", "놀이동산", "맛집탐방", "수영장");
		Map<Integer, String> res2 = s2.collect(Collectors.groupingBy(word -> word.length(), TreeMap<Integer, String>::new, Collectors.joining()));
		System.out.println(res2);
	}
}
