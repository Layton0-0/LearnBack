package com.test02;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.IntSupplier;

// 메소드 참조
// static -> 클래스명.멤버(메소드 명)
// non-static -> 객체.멤버
public class MTest02 {
	public static void main(String[] args) {
		// java.lang.String length() - public int length() 매개 인자 X
		// Supplier<T>: T타입으로 리턴 T get()
		String s = "Jdk ver1.8";
		IntSupplier supplier = s::length; // 매개인자 없는 메소드
		System.out.println(supplier.getAsInt());
		
//		System.out.println(); 매개 인자. -> void
		// Consumer<T> n - void메소드
		Consumer<String> c = System.out::println;
		c.accept("MySpring");
		
		// public static int sum(int a, int b): 매개인자
		IntBinaryOperator op = Integer::sum;
		System.out.println(op.applyAsInt(100, 200));
		
		Function<Integer, Double> r =  Math::sqrt;
		System.out.println(r.apply(100));
	}
}
