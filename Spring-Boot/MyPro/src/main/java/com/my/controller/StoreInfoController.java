package com.my.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.my.domain.StoreInfo;
import com.my.service.StoreInfoService;

@Controller
public class StoreInfoController {
	@Autowired
	StoreInfoService storeInfoService;
	
	@GetMapping("/")
	public String storeList(Model model) {
		ArrayList<StoreInfo> storeInfoList = new ArrayList<>();
		// StoreInfo storeInfo = new StoreInfo(storeCategory, storeCode, storeName,
		// storeTel, storeAddr, storeRegDate, storeLatitude, storeLongtitude, storeTag);
		String[] keyword = { "#������", "#�������ִ�", "#�ʹ�", "#����ī��", "#�̽���", "#�ż���" };
		StoreInfo storeInfo = new StoreInfo("������>�ѽ�>����,���", "B", "�ο�ؽ��ο�", "02-793-2268", "���� ��걸 ������ 126",
				"2022-04-12", 126.99421849699539, 37.53401162895581, keyword);
		// System.out.println(storeInfo);
		storeInfoList.add(storeInfo);
		System.out.println(storeInfoList);
		model.addAttribute("storeInfoList", storeInfoList);
		return "view/Test01";
	}
	
	@GetMapping("/gpstrack")
	public String gpsTrackTest(Model model) {
		return "view/GpsTracking";
	}
	
	@GetMapping("/test02")
	public String test02() {
		return "view/Test02";
	}
	
	@GetMapping("/test01")
	public String returnStoreList(Model model) {
		List<StoreInfo> storeInfoList = storeInfoService.findAll();
		for(StoreInfo s: storeInfoList) {
			System.out.println(s.getStoreName());
		}
		model.addAttribute("storeInfoList", storeInfoList);
		return "view/Test01";
	}
}
