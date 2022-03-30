package com.test.mytest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import reactor.core.publisher.Mono;

@Controller // 웹 페이지를 반환하는 스프링 웹 컨트롤러
public class ServletController {
	@GetMapping // 기본 url /
	Mono<String> Indexhome(){ // 템플릿의 이름을 나타내는 문자열을 Mono에 담아서 리턴
		return Mono.just("home"); // home을 가지고 view로 이동
		// Mono 0-1(0 또는 1): 요소 자체를 0또는 1개를 담는 리액티브 발생자 publisher이다. 
	}
	// classpath:/templates -> 접두어(Prefix)
	// .html -> 접미어(Suffix)
	
	// xmlns:th="http://www.thymeleaf.org" -> 비동기 통신을 하기 위해(리액티브 스트림 지원하는)
}
