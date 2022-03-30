package com.test02;


import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.EnumSet;
import java.util.Iterator;

public class MyAnnoTest {
	public enum myEnum{
		@MyAnno("1") X1, X2, X3
	}
	// @을 관리하는 컬렉션 = EnumSet<>한다.
	public static EnumSet<myEnum> res = EnumSet.of(myEnum.X1, myEnum.X2);
	public static void main(String[] args) {
		MyAnnoTest my = new MyAnnoTest();
		// 1. my가 가지고 있는 field를 리턴받자.
		Field field;
		try {
			field = my.getClass().getField("res");
			System.out.println(field);
			
			// 2. 필드가 가지고 있는 파라미터 타입을 확인해보자.
			ParameterizedType pt = (ParameterizedType) field.getGenericType();
			System.out.println(pt);
			
			// 3. ParameterizedType의 메소드를 통해서 값을 확인해보자.
			System.out.printf(" getRawType = %s \n getOwnerType = %s \n getReal = %s \n",
					pt.getRawType(), pt.getOwnerType(), pt.getActualTypeArguments());
			
			for(Type t: pt.getActualTypeArguments()) {
				System.out.println(t);
				Field[] enumFields = ((Class)t).getFields();
				for(Field f: enumFields) {
					System.out.println("enum element name: " + f.getName());
				}// inner for
			}// outer for
		} catch (NoSuchFieldException | SecurityException e) {
			e.printStackTrace();
		}
		
		System.out.println("=================================");
		
		Iterator ir = res.iterator();
		while(ir.hasNext()) {
			System.out.println(ir.next());
		}
	}
}
