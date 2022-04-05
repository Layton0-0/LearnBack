package com.test02;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("my_calc")
public class Calc {
   
	 @Value("200")
	 private   int  a ;
	 private  int  b;
	 
	 public  int getHap(int a,int  b) {
		  return  (a+b);
	 }
	 public int getSub(int a, int b) {
		  return (a-b);
	 }
	public int getA() {
		return a;
	}
	public int getB() {
		return b;
	}
	 
}

