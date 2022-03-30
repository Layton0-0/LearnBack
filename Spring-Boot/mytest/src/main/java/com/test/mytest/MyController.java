package com.test.mytest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;

@RestController // 화면 구성을 위한 view로 리턴되지 않고, 결과를 데이터 직렬화로 http response에 직접 쓴다.
// @Controller + @ResponseBody. 
public class MyController {
	@Autowired
	private MyService myService;
	
	// request의 get방식으로 연동해주는 spring webMvc / produces는 리턴되는 미디어 타입이다.
	// 0-N으로 비동기 통신을 하겠다. Address
	@GetMapping(value = "/server", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
	Flux<Address> serviceAddress(){
		return this.myService.getAllAddress();
	}
}
