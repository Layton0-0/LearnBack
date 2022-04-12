package com.my.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.NoArgsConstructor;

@NoArgsConstructor
@Table
@Entity
public class Board {
	@Id
	private String postId;
	@Column
	private String postTitle;
	@Column
	@NotNull
	private String postContent;
	@Column
	private String postDate;
	@Column
	private int postViews;
	@Column
	@NotNull
	private String boardId;
	@Column
	@NotNull
	private String userId;
	@Column
	private Integer postLike;
	@Column
	@NotNull
	private boolean postLikebook;
}
