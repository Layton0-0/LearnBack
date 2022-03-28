package com.test01;

// 1. Function<Integer, String> 실습
import java.util.function.Function;

public class MTest {
	public static void main(String[] args) {
		Function<Integer, String> M_fun = (i) -> Integer.toString(i);
		// 			T		R	=> String apply(Integer i) { return Integer.toString(i); }
		
		// T = Integer = i = 100
		System.out.println(M_fun.apply(100).length());	// String.length()
		
		// T = Integer = i = 1000
		System.out.println(M_fun.apply(1000).length());	// String.length()
	}

}
