package com.controller;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import java.sql.Connection;

import javax.sql.DataSource;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@Component
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
// 환경설정 테스트
@ContextConfiguration({
		"file:C:\\Users\\yesha\\Desktop\\코딩 공부\\멀캠\\Back\\LearnBack\\Spring\\WebScore\\WebContent\\WEB-INF\\applicationContext.xml",
		"file:C:\\Users\\yesha\\Desktop\\코딩 공부\\멀캠\\Back\\LearnBack\\Spring\\WebScore\\WebContent\\WEB-INF\\score-servlet.xml" })
public class ScoreControllerTest {
	// 1. Context가 제대로 설정되었는지 확인해보자.
	@Autowired
	private WebApplicationContext ctx;
	
	// 2. url 확인을 해보자.
	private MockMvc mockMvc; // url확인, 동적페이지 확인 등
	
	// 3. dataSource의 연결을 확인해보자.
	@Autowired
	private DataSource dataSource;
	
	@Before
	public void setup() {
		// 1번 실행 테스트
		this.mockMvc = MockMvcBuilders.webAppContextSetup(ctx).build();
	}
	
	// method이름은 어떤 것 이든 상관이 없다.
	@Test
	public void MyList() {
		// 2번 실행 테스트
		try {
			this.mockMvc.perform(MockMvcRequestBuilders.get("/score/list.do"));
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}
	
	// method이름은 어떤 것 이든 상관이 없다.
	@Test
	public void MyTest02() {
		// 3번 실행 테스트
		assertNotNull(dataSource);
		try(Connection con = dataSource.getConnection()) {
			assertNotNull(dataSource);
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}
	
	@Test
	public void MyFind() {
		// 2번 실행 테스트
		try {
			this.mockMvc.perform(MockMvcRequestBuilders.get("/score/find.do"));
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}
	
	@Test
	public void MyUpdate() {
		// 2번 실행 테스트
		try {
			this.mockMvc.perform(MockMvcRequestBuilders.get("/score/update.do"));
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}
	
	@Test
	public void MyInsert() {
		// 2번 실행 테스트
		try {
			this.mockMvc.perform(MockMvcRequestBuilders.get("/score/insert.do"));
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}
}
