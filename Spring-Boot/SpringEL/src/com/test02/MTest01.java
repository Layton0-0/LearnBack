package com.test02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class MTest01 {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/test02/application.xml");
		MyTest mt = context.getBean("my_test", MyTest.class);
		System.out.println("a의 값 범위 결과 : " + mt.isA_test());
		System.out.println("합 =" + mt.getHap());
		System.out.println("차  =" + mt.getSub());

		ExpressionParser parser = new SpelExpressionParser();
		// evals to "Hello World"
		String helloWorld = (String) parser.parseExpression("'Hello World'").getValue();
		System.out.println(helloWorld);

		double avogadrosNumber = (Double) parser.parseExpression("6.0221415E+23").getValue();
		System.out.println(avogadrosNumber);

		// evals to 2147483647
		int maxValue = (Integer) parser.parseExpression("0x7FFFFFFF").getValue();
		System.out.println(maxValue);

		boolean trueValue = (Boolean) parser.parseExpression("true").getValue();
		System.out.println(trueValue);

		Object nullValue = parser.parseExpression("null").getValue();
		
		Expression exp = parser.parseExpression("new String('hello world').toUpperCase()");
		String message = exp.getValue(String.class);
		System.out.println(message);
		
	    byte [] m=	 parser.parseExpression(" 'abcdefg'.getBytes()").getValue(byte[].class);
	       for( byte  r :m ) {
	    	    System.out.print(r +",");
	       }
		
		((AbstractApplicationContext) context).close();
	}
}



