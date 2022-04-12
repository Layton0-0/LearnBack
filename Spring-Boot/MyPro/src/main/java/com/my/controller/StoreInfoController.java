package com.my.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.my.domain.StoreInfo;

@Controller
public class StoreInfoController {
	@GetMapping("/test01")
	public String storeList(Model model) {
		ArrayList<StoreInfo> storeInfoList = new ArrayList<>();
		// StoreInfo storeInfo = new StoreInfo(storeCategory, storeCode, storeName,
		// storeTel, storeAddr, storeRegDate, storeLatitude, storeLongtitude, storeTag);
		String[] keyword = { "#±ú²ýÇÑ", "#ºÐÀ§±âÀÖ´Â", "#ÃÊ¹ä", "#ÀÌÀÚÄ«¾ß", "#½Ì½ÌÇÑ", "#½Å¼±ÇÑ" };
		StoreInfo storeInfo = new StoreInfo("À½½ÄÁ¡>ÇÑ½Ä>À°·ù,°í±â", "B", "·Î¿ì¾Ø½½·Î¿ì", "02-793-2268", "¼­¿ï ¿ë»ê±¸ º¸±¤·Î 126",
				"2022-04-12", 126.99421849699539, 37.53401162895581, keyword);
		// System.out.println(storeInfo);
		storeInfoList.add(storeInfo);
		System.out.println(storeInfoList);
		model.addAttribute("storeInfoList", storeInfoList);
		return "view/Test01";
	}
}
