package com.test03;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ImportResource;

// org.springframework.context.annotation.ImportResource
@ImportResource("classpath:/com/test03/AppConfig")
public class Student {
	@Value("${myName}")
	private String name;
	
//	@Value("${myAddr}")
	@Value("서울")
	private String address;
	
	@Value("${myAge}")
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", address=" + address + ", age=" + age + "]";
	}
	
	
}
