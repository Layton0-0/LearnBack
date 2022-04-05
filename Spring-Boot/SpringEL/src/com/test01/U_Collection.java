package com.test01;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("u_ctn")
public class U_Collection {
    
	@Value("#{testBean.map['4']}")
	 private   String map;
	
	 @Value("#{testBean.list[0].toUpperCase()}")
	 private    String list;

	@Override
	public String toString() {
		return "U_Collection [map=" + map + ", list=" + list + "]";
	} 
	 
}

