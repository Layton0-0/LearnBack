package com.test01.Anno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// ""안에 main에서 호출할 이름을 지정해준다.
// 6. @Component("MyTest")를 이용해서
@Component("MyTest") // <bean id="MyTest" class="com.test01.Anno.NicNamePrn"/>
public class NicNamePrn {
	/* <bean id="MyTest" class="com.test01.Anno.NicNamePrn">
	 * 	<property name="nicName" ref="nicName/> 
	 * </bean> 처럼 만든다.
	 * */
	
	@Autowired // 4. 이렇게 생긴 생성자 찾음. public NicNamePrn(NicName nicName)
				// 없으면 set함수를 찾는다. public setNicName(NicName nicName)
	NicName nicName;

	@Override
	public String toString() {
		return "NicNamePrn [nicName=" + nicName + "]";
	}
	
	
}
