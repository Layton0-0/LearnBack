package com.test01;

import java.util.*;

import org.springframework.stereotype.Component;

@Component("testBean")
public class MyCollection {
	private Map<String, String> map;
	private List<String> list;

	public MyCollection() {
		map = new HashMap<>();
		map.put("1", "1이다  ");
		map.put("2", "2이다  ");
		map.put("3", "3이다  ");
		map.put("4", "4이다  ");

		list = new ArrayList<>();
		list.add("mylist01");
		list.add("mylist02");
		list.add("mylist03");
		list.add("mylist04");
	}

	public Map<String, String> getMap() {
		return map;
	}

	public List<String> getList() {
		return list;
	}
	

}

