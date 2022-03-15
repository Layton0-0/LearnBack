package com.test03;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.PropertySource;

// 2. Configuration로 인해 각각의 @Bean의 객체를 생성해 <bean/>으로 관리
// @Configuration = <beans></beans>
@Configuration
@PropertySource("classpath:/com/test03/a.properties") // 3. 리소스로 호출(해당 패스로 감)
public class AppConfig {
	
	// @Bean = <bean></bean>
	@Bean(name="school")
	// student를 먼저 로드해다오. 단일 로드가 아닐 경우에 DependsOn은 명시해주는게 좋음.
	@DependsOn("student")
	public School getSchool() {
		School sm = new School();
		sm.setGrade(2);
		return sm;
	}
	
	@Bean(name="student")
	public Student getStudent() {
		Student s = new Student();
		return s;
	}
}
