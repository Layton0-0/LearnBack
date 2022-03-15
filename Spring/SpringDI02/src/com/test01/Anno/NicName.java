package com.test01.Anno;

import org.springframework.stereotype.Component;

// 5. class NicName을 @Component를 통해서 객체가 생성된다.
// @Component = <bean id="nicName" class="com.test01.Anno.NicName"/> 처럼.
@Component
public class NicName {

	@Override
	public String toString() {
		return "NicName [다람이]";
	}
	
}
