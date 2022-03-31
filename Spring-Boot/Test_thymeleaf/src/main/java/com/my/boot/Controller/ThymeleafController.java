package com.my.boot.Controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.my.boot.domain.Member;

@Controller
public class ThymeleafController {
	
	@GetMapping("study/thymeleaf")
	// -> 요청하게 되면 src/main/resources/templates 하위로 요청.
	public void sendSataForStudy(HttpSession session) {
		// Vo = domain
		Member member = new Member();
		member.setUserId("thymeleafStudent");
		member.setPassword("1234");
		member.setGrade("일반");
		member.setTell("010-0000-0000");
		member.setLoginCnt(10);
		member.setRegDate("2022-03-31");
		session.setAttribute("userInfo", member);
	}
}
