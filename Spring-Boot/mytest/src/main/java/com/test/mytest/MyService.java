package com.test.mytest;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Service;

import reactor.core.publisher.Flux;

@Service
public class MyService {
	private Random myRan = new Random(); // 1. 랜덤클래스를 생성해서 빈 객체를 선언한다.
	
	// 2. Address라는 도메인을 3개 객체 생성해서 배열로 담아 List로 리턴
	private List<Address> all = Arrays.asList(
			new Address("Hong", "Seoul", "02-000-0000"),
			new Address("Park", "KyungGi", "031-000-0000"), 
			new Address("Jung", "Busan", "051-000-0000"));
	
	// 3. List 컬렉션인 all 객체가 가진 지정된 요소를 찾아서 리턴하는 get()메소드로 하나를 랜덤으로 리턴받는다. 
	private Address randomAddress() {
		return all.get(myRan.nextInt(all.size()));
		// all.get(0) -> new Address("Hong", "Seoul", "02-000-0000")
	}
	
	// 4. 컨트롤에서 리턴되어 브라우저에 출력되는 레코드를 지정된 시간동안 무한 반복하면서 리턴한다.
	public Flux<Address> getAllAddress() {
		// generate: 무한적으로 연속적인 데이터를 리턴하는 메소드
		return Flux.<Address>generate(sink -> sink.next(randomAddress())).delayElements(Duration.ofMillis(250));
	}

}
