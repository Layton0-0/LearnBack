package com.model;

import org.springframework.stereotype.Repository;

// dao는 무조건 repository 어노테이션을 붙여준다.
@Repository
public class HelloDao {
	public String getHello() {
		return "안녕, 난 다오야";
	}
}
