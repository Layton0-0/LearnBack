package com.test01;

import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

// 4. Supplier 연습
public class MTest03 {
	public static void main(String[] args) {
		Supplier<String> s = () -> "abc";
		System.out.println(s.get());
		
		IntSupplier y = () -> 100;
		System.out.println(y.getAsInt());
		
		DoubleSupplier t = () -> 97.9;
		System.out.println(t.getAsDouble());
	}
}
