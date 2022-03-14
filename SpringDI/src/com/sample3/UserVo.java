package com.sample3;

import java.util.Date;
import java.util.Properties;

public class UserVo {
	
	private String userName;
	private Properties per;
	private Date my_date;
	
	private UserVo() {
		super();
		
	}
	

	private UserVo(String userName) {
		super();
		userName = this.userName;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public Properties getPer() {
		return per;
	}


	public void setPer(Properties per) {
		this.per = per;
	}


	public Date getMy_date() {
		return my_date;
	}


	public void setMy_date(Date my_date) {
		this.my_date = my_date;
	}




}
