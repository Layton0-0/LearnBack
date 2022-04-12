package com.my.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@ToString
@Table
@Entity
public class StoreInfo {
	
	public StoreInfo(@NotNull String storeCategory, String storeCode, @NotNull String storeName,
			@NotNull String storeTel, @NotNull String storeAddr, String storeRegDate, @NotNull double storeLatitude,
			@NotNull double storeLongtitude, String[] storeTag) {
		super();
		this.storeCategory = storeCategory;
		this.storeCode = storeCode;
		this.storeName = storeName;
		this.storeTel = storeTel;
		this.storeAddr = storeAddr;
		this.storeRegDate = storeRegDate;
		this.storeLatitude = storeLatitude;
		this.storeLongtitude = storeLongtitude;
		this.storeTag = storeTag;
	}
	
	@Column
	@NotNull
	private String storeCategory;
	@Id
	private String storeCode;
	@Column
	@NotNull
	private String storeName;
	@Column
	@NotNull
	private String storeTel;
	@Column
	@NotNull
	private String storeAddr;
	@Column
	private String storeRegDate;
	@Column
	@NotNull
	private double storeLatitude;
	@Column
	@NotNull
	private double storeLongtitude;
	@Column
	private String[] storeTag;
}
