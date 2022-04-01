package com.myjpa.controller;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.myjpa.service.MyService;

@Controller
public class MyController {
	@Autowired
	private MyService service;
	
	@RequestMapping	// ("/")생략 -> 부트만
	public String index(@RequestParam(required = false)String title, Model model) {
		// localhost:9898/?title="getting"
		// 요청하는 페이지에서 입력받은 title을 저장해라.
		if(!Objects.isNull(title) && !title.isBlank()) {
			this.service.save(title); // 저장.
		}
		// books = service.findAll() -> 이걸 가져감.
		model.addAttribute("books", this.service.findAll());
		return "index"; // view의 (prefix)main\resources\templates\index.html(suffix)로 이동.
	}
}
