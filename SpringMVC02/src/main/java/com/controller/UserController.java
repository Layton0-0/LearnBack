package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.entity.User;
import com.model.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	
	// 입력페이지로 이동하기
	// 아래의 요청이 오면(RequestMapping)
	@RequestMapping("/insert.sp")
	public ModelAndView insertPage() {
		return new ModelAndView("insert");
	}
	
	// 입력하기: 입력페이지에서 값을 받아서 (entity)로 전달한 객체를 비즈(서비스)로 DAO를 통해 저장하게 된다.
	@RequestMapping(value="/insertRes.sp", method = RequestMethod.POST)
	public ModelAndView insertRes(@ModelAttribute User user) {
		
		// 값이 있으면 list로 보내고
/*		if(userService.insertUser(user) == true) {
			return "/list.sp";
			// 값이 없으면 insert 페이지로 돌려보냄
		} else {
			return new ModelAndView("insert");
		}
		*/
		return new ModelAndView("insert");
	}		
	
	// 전체 출력페이지
	@RequestMapping("/list.sp")
	public ModelAndView list() {
		// 별칭, 페이지 이름, 내용
		ModelAndView model = new ModelAndView("list", "allList", userService.listUser());
		return model;
	}
}
