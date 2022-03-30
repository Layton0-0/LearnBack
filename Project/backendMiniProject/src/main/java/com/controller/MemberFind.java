package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.biz.MemberBiz;
import com.vo.MemberVo;

@Controller
public class MemberFind {
	@Autowired
	private MemberBiz biz;

	@RequestMapping("/memberFind.do")
	public ModelAndView search(@RequestParam("id") String id, @RequestParam("pw") String pw) {
		// String id= request.getPramameter("id");
		MemberVo vo = biz.find(id);
		ModelAndView mav = null;
		if (vo == null) {
			mav = loginFail(vo);
		} else {
			if (vo.getPw().equals(pw)) {
				mav = loginSuccess(vo);
			} else {
				mav = loginFail(vo);
			}
		}
		return mav;

	}

	public ModelAndView loginSuccess(MemberVo vo) {
		if(vo.getId().equals("admin")) {
			return new ModelAndView("admin/addProduct");
		}
		return new ModelAndView("detailUserData", "vo", vo);
	}

	public ModelAndView loginFail(MemberVo vo) {
		return new ModelAndView("loginFail");
	}
}
