package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {
	@ResponseBody
	@RequestMapping(value = "/login.do", method = RequestMethod.POST)
	public String checkUser(String id, String pw) {
		System.out.println(id + pw);
		if(id.equals("abcd") && pw.equals("1234")) {
			return "login ok";
		} else {
			return "login fail";
		}
	}
}
