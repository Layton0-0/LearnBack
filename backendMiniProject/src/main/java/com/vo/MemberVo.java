package com.vo;

import java.sql.Date;

public class MemberVo {
	String name;
	String id;
	String pw;
	String tel;
	String address;
	String email;
	Date birth;
	int age;
	String sex;
	
	public MemberVo(String name, String id, String pw, String tel, String address, String email, Date birth, int age,
			String sex) {
		super();
		this.name = name;
		this.id = id;
		this.pw = pw;
		this.tel = tel;
		this.address = address;
		this.email = email;
		this.birth = birth;
		this.age = age;
		this.sex = sex;
	}

	public String getName() {
		return name;
	}

	public String getId() {
		return id;
	}

	public String getPw() {
		return pw;
	}

	public String getTel() {
		return tel;
	}

	public String getAddress() {
		return address;
	}

	public String getEmail() {
		return email;
	}

	public Date getBirth() {
		return birth;
	}

	public int getAge() {
		return age;
	}

	public String getSex() {
		return sex;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	
	
	
	
}
