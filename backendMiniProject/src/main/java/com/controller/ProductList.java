package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.biz.ProductBiz;

@Controller
public class ProductList {
	@Autowired
	ProductBiz productBiz;

	@ResponseBody
	@RequestMapping(value="/showProductList.do")
	public ModelAndView showProduct() {
		return new ModelAndView("showProductList", "productList", productBiz.select());
	}

}
