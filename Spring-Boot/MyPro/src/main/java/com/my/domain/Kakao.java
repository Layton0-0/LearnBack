package com.my.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Table
@Entity
public class Kakao {
	@NotNull
	@Column
	private String storeName;
	@Id
	private String storeCode;
	@NotNull
	@Column
	private String x;
	@NotNull
	@Column
	private String y;

}
