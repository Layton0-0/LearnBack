package com.my.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.my.domain.StoreInfo;
import com.my.repository.StoreInfoRepository;

@Service
public class StoreInfoService{
	
	@Autowired
	private StoreInfoRepository storeInfoRepository;
	
	public List<StoreInfo> findAll() {
		return storeInfoRepository.findAll();
	}
	
	public List<StoreInfo> saveAll(List<StoreInfo> list) {
		return storeInfoRepository.saveAll(list);
	}
	
	
	
	

}
