package com.test;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class HelloControllerETest {
	@Autowired
	private TestRestTemplate template;
	
	@Test
	public void getHello() throws Exception{
		ResponseEntity<String> response = template.getForEntity("/test", String.class);
		assertThat(response.getBody()).isEqualTo("Greetings from Spring Boot!");
	}
}
