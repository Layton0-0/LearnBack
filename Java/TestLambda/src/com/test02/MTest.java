package com.test02;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;
// 생성자 참조 실습
class MyConstruct {
	String name;
	int age;	

	public MyConstruct() {
		name = "Kim";
		age = 30;
	}
	public MyConstruct(String name) {
		this.name = name;
		this.age = 30;
	}
	public MyConstruct(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "MyConstruct [name=" + name + ", age=" + age + "]";
	}	
}

public class MTest{
	public static void main(String[] args) {
		// Supplier<T>: T타입으로 리턴 T get()
		// (1) MyConstruct:: new의 기본생성자인 객체가 생성하여 대입된다. MyConstruct()
		Supplier<MyConstruct> func = MyConstruct::new; // (1)
		MyConstruct res = func.get();
		System.out.println(res);
		
		// (2) MyConstruct(String name)로 입력하게 되면 생성되는 생성자를 통해 값을 리턴
		Function<String, MyConstruct> func1 = MyConstruct::new;
		System.out.println(func1.apply("Shin"));
		
		// (3) MyConstruct(String name, int age)로 입력해서 2개를 대입하고 String으로 리턴
		BiFunction<String, Integer, MyConstruct> func3 = MyConstruct::new;
		System.out.println(func3.apply("Han", 25));
	}
}
