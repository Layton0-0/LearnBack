package com.test02;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("my_test")
public class MyTest {

	@Value("#{my_calc.a >= 50  and  my_calc.a <=100}")
	private boolean a_test;
	
    @Value("#{my_calc.getHap(100,100)}")
	private  int hap;
    
    @Value("#{my_calc.getSub(200,100)}")
	private  int sub;
	
		
	public int getHap() {
		return hap;
	}


	public int getSub() {
		return sub;
	}


	public boolean isA_test() {
		return a_test;
	}

	   
}


