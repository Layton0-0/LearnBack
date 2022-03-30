package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.biz.ProductBiz;
import com.vo.ProductVo;

@Controller
public class AdminController {
	@Autowired
	ProductBiz productBiz;

	@ResponseBody
	@RequestMapping(value="/addProduct.do", method = RequestMethod.POST)
	public ModelAndView addProduct(ProductVo vo) {
		productBiz.insert(vo);
		return new ModelAndView("showProductList", "productList", productBiz.select());	
	}

}
