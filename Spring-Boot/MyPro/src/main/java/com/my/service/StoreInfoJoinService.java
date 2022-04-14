package com.my.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.my.domain.StoreInfoJoin;
import com.my.repository.StoreInfoJoinRepository;

@Service
public class StoreInfoJoinService{
	
	@Autowired
	private StoreInfoJoinRepository storeInfoJoinRepository;
	
	public List<StoreInfoJoin> findAll() {
		return storeInfoJoinRepository.findAll();
	}
	
	public List<StoreInfoJoin> saveAll(List<StoreInfoJoin> list) {
		return storeInfoJoinRepository.saveAll(list);
	}
	
	
	
	

}
