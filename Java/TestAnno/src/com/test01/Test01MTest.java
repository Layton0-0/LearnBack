package com.test01;

import java.lang.reflect.Method;

// 3. @지정된 클래스를 호출해서 실행해보자.
public class Test01MTest {
	
	public static void main(String[] args) {
		//Object obj = null;
		Class<MyClass> obj =null;
		try {
			obj = (Class<MyClass>) Class.forName("com.test01.MyClass");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		Method[] mo = obj.getDeclaredMethods();
		for(Method res: mo) {
			// MyClass가 리턴하는 메소드 중에서 생성된 @이 적용된 메소드를 리턴해서
			System.out.println(res.getName());
			Dan d = res.getAnnotation(Dan.class);
			System.out.println("적용된 내용을 확인: " + d.value());
			// 내용을 출력해보자.
			int dans = Integer.parseInt(d.value());
			MyClass anno = new MyClass();
			anno.PrnGuGuDan(dans);
		}

	}

}
