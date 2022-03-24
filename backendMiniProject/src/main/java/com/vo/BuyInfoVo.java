package com.vo;

public class BuyInfoVo {
	private String buyCode;
	private String buyDate;
	
	private String userId;
		
	private String pdCode;
		
	public BuyInfoVo() {
		super();
	}

	public BuyInfoVo(String buyCode, String buyDate, String userId, String pdCode) {
		super();
		this.buyCode = buyCode;
		this.buyDate = buyDate;
		this.userId = userId;
		this.pdCode = pdCode;
	}

	public String getBuyCode() {
		return buyCode;
	}

	public void setBuyCode(String buyCode) {
		this.buyCode = buyCode;
	}

	public String getBuyDate() {
		return buyDate;
	}

	public void setBuyDate(String buyDate) {
		this.buyDate = buyDate;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPdCode() {
		return pdCode;
	}

	public void setPdCode(String pdCode) {
		this.pdCode = pdCode;
	}



	
	
	
	
}
