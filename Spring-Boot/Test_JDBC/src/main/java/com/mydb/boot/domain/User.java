package com.mydb.boot.domain;

import lombok.Data;

@Data
public class User {
	private int userId;
	private String password;
	private String userName;
	private int age;
	private String role;
}
