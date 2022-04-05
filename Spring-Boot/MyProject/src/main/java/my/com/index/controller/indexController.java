package my.com.index.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class indexController {         
	
	
	 @GetMapping("/")
	 public String index() {
		 return "index";  //메인화면이동
	 }
}
