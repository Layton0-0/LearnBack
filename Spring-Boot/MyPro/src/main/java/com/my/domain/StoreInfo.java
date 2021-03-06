package com.my.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@DynamicInsert
@DynamicUpdate
@Entity
public class StoreInfo {

	@Column
	@NotNull
	private String storeCategory;
	
	@Id
	@NotNull
	private String storeName;

	@Column
	@NotNull
	private String storeTel;

	@Column
	@NotNull
	private String storeAddr;

	@Column(columnDefinition = "datetime default now()")
	private String storeRegdate;
	
	@Column
	private String storeTag;
}
