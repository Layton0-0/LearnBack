package com.my.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@DynamicInsert
@DynamicUpdate
@Entity
public class StoreInfoJoin {
	@Column
	@NotNull
	private String storeCategory;

	@Id
	@GeneratedValue
	@NotNull
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
	private String storeRegdate;

	@Column
	@NotNull
	private Double storeLatitude;

	@Column
	@NotNull
	private Double storeLongtitude;
	
	@Column
	private String storeTag;
}
