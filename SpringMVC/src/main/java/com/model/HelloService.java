package com.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloService {
	// autowired의 역할
	@Autowired
	private HelloDao hellodao;
	
//	public HelloService(HelloDao hellodao) {
//		this.hellodao = hellodao;
//	}
//	public void setHelloDao(HelloDao hellodao) {
//		this.hellodao = hellodao;
//	} --> @Autowired의 역할
	
	public String getHello() {
		return hellodao.getHello();
	}
}
