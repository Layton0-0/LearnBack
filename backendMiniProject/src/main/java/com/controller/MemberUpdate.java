package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.biz.MemberBiz;
import com.vo.MemberVo;

@Controller
public class MemberUpdate {
	@Autowired
	MemberBiz memberBiz;
	
	@ResponseBody
	@RequestMapping(value="/updateUser.do", method = RequestMethod.POST)
	public ModelAndView updateUserControll(MemberVo vo) {
		return new ModelAndView("detailUserData", "vo", memberBiz.update(vo));
	}
}
