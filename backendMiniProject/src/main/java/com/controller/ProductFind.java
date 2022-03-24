package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.biz.ProductBiz;

@Controller
public class ProductFind {
	@Autowired
	private ProductBiz biz;

	@RequestMapping("/productFind.do")
	public ModelAndView search(@RequestParam("pdName") String pdName) {
		return new ModelAndView("showProductList", "productList", biz.select(pdName));
	}

}
