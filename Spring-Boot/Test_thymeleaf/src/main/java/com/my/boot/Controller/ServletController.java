package com.my.boot.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.my.boot.domain.Member;

@Controller
public class ServletController {
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/input")
	public String index02() {
		return "inputMember";
	}
	
	// 페이지 요청할 때마다 입력되는 내용을 담을 객체
	private static List<Member> memberAll = new ArrayList<>();
	
	// 1. /display로 post로 요청하게 되면 호출되는 메소드
	// 2. 폼태그를 Member가 가진 필드로 name을 맞춰놔서 @ModelAttribute로 Member member로 자동대입
	@RequestMapping(value = "/display", method = RequestMethod.POST)
	public ModelAndView saveEmployee(@ModelAttribute Member member, ModelAndView mav) {
		mav.setViewName("memberDetails"); // memberDetails.html
		memberAll.add(member); // list객체로 추가
		mav.addObject("memberList", memberAll); // 모델을 request객체에 저장
		return mav; // 리턴. memberDetail.html으로 inputMember.html에서 입력받은 값이 memberList라는 이름으로 저장되어 전달된다.
	}
	
	// 2번째 형식
	public ModelAndView saveEmployee02(@ModelAttribute Member member) {
		memberAll.add(member); // list객체로 추가
		return new ModelAndView("memberDetails", "memberList", memberAll); 
	}
}

