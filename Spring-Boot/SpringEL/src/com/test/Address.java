package com.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
// $4.3 https://docs.spring.io/spring-framework/docs/current/reference/html/core.html#expressions
@Component("myaddress")
public class Address {
	@Value("SDS µ•¿Ã≈∏ ")
	private String addr;
	@Value("02-000-7302")
	private String tel;

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	@Override
	public String toString() {
		return "Address [addr=" + addr + ", tel=" + tel + "]";
	}

}
