package com.my.boot.domain;

import lombok.Data;

@Data
public class Member {
	private String userId;
	private String password;
	private String tell;
	private String grade;
	private Integer loginCnt;
	private String regDate;
}
