package com.sample2;

public class Address {
	
	private String name, tel, addr;
	private Address() {
		super();
		System.out.println("기본 생성자  ");
	}
	
	
	private Address(String name, String addr, String tel) {
		super();
		name = this.name;
		addr = this.addr;
		tel = this.tel;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getTel() {
		return tel;
	}


	public void setTel(String tel) {
		this.tel = tel;
	}


	public String getAddr() {
		return addr;
	}


	public void setAddr(String addr) {
		this.addr = addr;
	}


	@Override
	public String toString() {
		return "Address [name=" + name + ", tel=" + tel + ", addr=" + addr + "]";
	}
	
	
	
	
	

}
