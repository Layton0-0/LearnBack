package com.test01;

import java.util.function.Consumer;

// 5. Consumer 실습
public class MTest04 {

	public static void main(String[] args) {
		Consumer<String> c = s -> System.out.println(s);
		c.accept("abc");
		
		Consumer<String> c1 = s -> System.out.println("c1 = " + s);
		Consumer<String> c2 = s -> System.out.println("c2 = " + s);
		
		Consumer<String> res = s -> c1.andThen(c2).accept(s);; // c1, c2를 순서대로
		res.accept("abc");
		
		

	}

}
