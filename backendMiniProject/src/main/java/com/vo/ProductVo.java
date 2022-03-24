package com.vo;

public class ProductVo {	
	private int pdCode;
	private String pdName;
	private int pdPrice;
	private int pdStock;
	private String pdDetail;
//	
//	private String pdImg;
//	private String pdThumbImg;
	
	public ProductVo() {
		super();
	}

	public ProductVo(int pdCode, String pdName, int pdPrice, int pdStock, String pdDetail) {
		super();
		this.pdCode = pdCode;
		this.pdName = pdName;
		this.pdPrice = pdPrice;
		this.pdStock = pdStock;
		this.pdDetail = pdDetail;
	}

	public int getPdCode() {
		return pdCode;
	}

	public void setPdCode(int pdCode) {
		this.pdCode = pdCode;
	}

	public String getPdName() {
		return pdName;
	}

	public void setPdName(String pdName) {
		this.pdName = pdName;
	}

	public int getPdPrice() {
		return pdPrice;
	}

	public void setPdPrice(int pdPrice) {
		this.pdPrice = pdPrice;
	}

	public int getPdStock() {
		return pdStock;
	}

	public void setPdStock(int pdStock) {
		this.pdStock = pdStock;
	}

	public String getPdDetail() {
		return pdDetail;
	}

	public void setPdDetail(String pdDetail) {
		this.pdDetail = pdDetail;
	}

		
}
