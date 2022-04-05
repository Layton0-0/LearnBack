package com.mytag;

import java.util.ArrayList;
import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	
	@Autowired
	private UserValidator   userValidator;
	
	@RequestMapping(value="/myview.do",method=RequestMethod.GET)
	public ModelAndView myView() {		
		MyUser  m =new MyUser();
		ModelAndView m1=new ModelAndView("myform","user",m);
			return m1;		
	}
	
	@RequestMapping(value="/myview.do",method=RequestMethod.POST)	
	public ModelAndView myView_res(@ModelAttribute("user") MyUser m, Errors    result) {		
				userValidator.validate(m, result);  //¿Ø»øº∫∞ÀªÁ
			if(result.hasErrors()){
			return  new ModelAndView("myform"); 
		}		
		return null;		
	}
	
	
	
	
	
	
	@RequestMapping("/myview02.do")
	public ModelAndView myView02() {		
    	Preferences pre = new Preferences();
		ModelAndView m1 = new ModelAndView("myform02", "preferences", pre);
		m1.addObject("interestList", pre.getInterestList());
		
		List<String>  skills   =  new ArrayList<>();
		skills.add("ª°∞≠¿Ã");
		skills.add("≥Î∂˚¿Ã");
		skills.add("∞Àµ’¿Ã");
		skills.add("111");
		skills.add("2222");
		skills.add("3333");
		m1.addObject("skills",skills);	
	
		
		return m1;
	}
}





