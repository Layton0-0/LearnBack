package com.myjpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.myjpa.service.MyService;

@Controller
public class PageController {
	@Autowired
	private MyService service;

	// localhost:9898/pagelist01
	@RequestMapping("/pagelist01")
	public String index(Model model) {
		model.addAttribute("books", service.findAll02());
		return "index";
	}

	// localhost:9898/pagelist02/0
	@RequestMapping("/pagelist02/{pageNo}")
	public String index02(@PathVariable Integer pageNo, Model model) {
		// static PageRequest of(int page, int size, Sort.Direction direction, String...
		// properties)
		// 첫번째 페이지에 5개씩 내림차순으로 출력하고 싶다. new 대신에 of 사용해야 함.
		PageRequest req = PageRequest.of(pageNo - 1, 5, Sort.Direction.DESC, "title");
		model.addAttribute("books", service.findAll03(req));
		System.out.println(service.findAll03(req).getSize());
		return "index";
	}
}
