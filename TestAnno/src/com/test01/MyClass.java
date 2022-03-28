package com.test01;

public class MyClass {
	// 2. 적용
	@Dan("7") // "String value();로 전달"
	public void PrnGuGuDan(int dan) {
		for(int i = 1; i <= 9; i++) {
			System.out.println(dan + "*" + i + "=" + (dan*i));
		}
	}
}
