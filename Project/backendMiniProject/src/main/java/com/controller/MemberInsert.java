package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.biz.MemberBiz;
import com.vo.MemberVo;

// 사용자 요청정보를 받아서 Business Component(Biz객체)에 전달하고 처리 결과를 View(결과화면)에 전달한다.
@Controller
public class MemberInsert {
	@Autowired
	MemberBiz memberBiz;
	
	@ResponseBody
	@RequestMapping(value="/signup.do", method = RequestMethod.POST)
	public ModelAndView signupControll(MemberVo vo) {
		MemberVo voFind = memberBiz.find(vo.getId());
		if(voFind != null) {
			return new ModelAndView("signupResult");
		}
		return new ModelAndView("signupResult", "signupResult", memberBiz.insert(vo));
	}
}

