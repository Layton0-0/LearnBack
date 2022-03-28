package com.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Test {
	public static void main(String[] args) {
		try {
			Class t = Class.forName("java.util.Date");
			System.out.println("Date가 가진 생성자 목록을 출력하자.");
			
			for(Constructor res: t.getConstructors()) {
				System.out.println(res.toString());
			}
			System.out.println();
			System.out.println("Date가 가진 메소드 목록을 출력하자.");
			
			for(Method res: t.getMethods()) {
				System.out.println(res.toString());
			}
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
	}
}
