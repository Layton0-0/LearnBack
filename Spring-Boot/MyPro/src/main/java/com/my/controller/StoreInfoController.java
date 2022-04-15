package com.my.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.my.domain.Kakao;
import com.my.domain.StoreInfo;
import com.my.domain.StoreInfoJoin;
import com.my.service.StoreInfoJoinService;
import com.my.service.StoreInfoService;

@Controller
public class StoreInfoController {
	@Autowired
	StoreInfoService storeInfoService;
	
	@Autowired
	StoreInfoJoinService storeInfoJoinService;
	
	@GetMapping("/gpstrack")
	public String gpsTrackTest(Model model) {
		return "view/GpsTracking";
	}
	
	@GetMapping("/test02")
	public String test02() {
		return "view/Test02";
	}
	
	@GetMapping("/storeList")
	public String returnStoreList(Model model) {
		List<StoreInfo> storeInfoList = storeInfoService.findAll();
		for(StoreInfo s: storeInfoList) {
			System.out.println(s.getStoreName());
		}
		model.addAttribute("storeInfoList", storeInfoList);
		return "view/Test01";
	}
	
	@GetMapping("/")
	public String returnStoreJoinList(Model model) {
		List<StoreInfoJoin> storeInfoJoinList = storeInfoJoinService.findAll();

		model.addAttribute("storeInfoJoinList", storeInfoJoinList);
		return "view/Test04";
	}
	
	@GetMapping("/storeData")
	public String storeDataTest(Model model) {
		List<StoreInfoJoin> storeInfoList = storeInfoJoinService.findAll();
		return "view/GpsTracking";
	}
}
