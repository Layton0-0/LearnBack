package com.test;
/* 
 이름	주소	전화번호		Address	(name, addr, tel)
 홍길동	서울	02-0000		a1
 정길동	인천	032-0000	a2
 박길동	부산	051-0000	a3
*/
// 풀캡슐화(class구조): 멤버변수는 은닉화(private)하고 오픈된(public) 메소드를 통해서 값 전달 및 변경(setter), 리턴(getter)하는 구조
// class = userDataType : 클래스를 만드는 이유.

public class Address {
	private String name;
	private String addr;
	private String tel;
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
		return "Address [name=" + name + ", addr=" + addr + ", tel=" + tel + "]";
	}
	
	
	
}
