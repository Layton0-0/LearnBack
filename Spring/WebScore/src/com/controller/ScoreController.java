package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.biz.ScoreBIZ;
import com.entity.ScoreEntity;
import com.vo.ScoreVO;

//requestScope
//  { "/ScoreController", "/select", "/insert", "/delete", "/update", "/find" })
@Controller
@RequestMapping("/score/*")
public class ScoreController {
	@Autowired
	ScoreBIZ scoreBIZ;

	@GetMapping("/list.do")
	public ModelAndView mySelect() {
		//List<ScoreEntity> all = scoreBIZ.getAllScore();
		// all에다가 담아서 넘기겠다.
		// modelandview = model(biz + DAO)에다 리턴값을 담아서 view로 보내는 것.
		return new ModelAndView("listScore", "all", scoreBIZ.getAllScore());
		// /WEB-INF/score/(1)listScore.jsp (2)all= (3)scoreBIZ.getAllScore() -> 이렇게 담아서 앞의 페이지로 이동하라.
		// 												request.setAttribute("all", scoreBIZ.getAllScore());
		// <property name="prefix" value="/WEB-INF/score/" />
		// <property name="suffix" value=".jsp" />
	}
	
	// 삭제 후 전체 목록으로 바로 이동. delete.do?del_name=${se.name}
	@RequestMapping(value = "/delete.do", method = RequestMethod.GET)
	public String myDelete(@RequestParam("del_name") String name) { // -> name = del_name
		int r = scoreBIZ.getDelScore(name);
		if(r > 0) { // 바로 페이지 이동 -> 다시 mySelect 호출
			return "redirect:/score/list.do";
		} else {
			return "";
		}
	}
	
	// find는 이름으로 찾아서 updateScore.jsp로 일단 보내면 수정값 입력 후 업데이트
	// 서블릿으로 이동해서 실제 데이터를 다오를 통해서 업데이트가 된다.
	
	@RequestMapping(value = "/find.do", method = RequestMethod.GET)
	public ModelAndView myFind(@RequestParam("find_name") String name) {
		ScoreEntity r = scoreBIZ.getFindScore(name);
		return new ModelAndView("updateScore", "find", r);
	}
	
	@RequestMapping(value = "/update.do", method = RequestMethod.GET)
	public String myUpdate(@ModelAttribute("scoreVo") ScoreVO vo) {
		int r = scoreBIZ.getUpdateScore(vo);
		return "redirect:/score/list.do";
	}
	
	// /score/input.do
	@GetMapping("input.do")
	public ModelAndView myInput(ModelAndView view) {
		view.setViewName("inputScore"); // WEB-INF/score/inputScore.jsp
		return view;
	}
	
	@PostMapping("/insert.do")
	public ModelAndView register(@ModelAttribute("scoreVo") ScoreVO vo) {
		int r = scoreBIZ.getInsertScore(vo);
		if(r > 0) {
			return new ModelAndView("listScore", "all", scoreBIZ.getAllScore());
		} else {
			return new ModelAndView("error");
		}
		//	return "redirect:/score/list.do"; -> 이게 더 나음.
	}
	
}
