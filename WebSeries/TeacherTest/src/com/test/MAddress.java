package com.test;
/* 
이름	주소	전화번호		Address	(name, addr, tel)
홍길동	서울	02-0000		a1
정길동	인천	032-0000	a2
박길동	부산	051-0000	a3
*/
public class MAddress {

	public static void main(String[] args) {
		/*
		 메모리맵(메모리영역) -> ds(data segment), cs(code segment), static(정적), heap(동적), stack(고정)
		 ds: 데이터를 관리하는 곳(해쉬테이블)
		 cs: 코드를 관리하는 곳
		 static: 정적영역, 정적공간, static, class, struct, union, function &
		 heap: 동적할당공간, 자유영역공간(다른 프로그램 영역이 할당해준 공간에 new연산자를 만나면 메모리를 사용했다가 소멸되는 곳
		 stack: 고정 공간(휴지통)
		*/
		Address a1 = new Address(); // new -> 객체를 생성자를 통해서 생성하면서 메모리(자유영역공간 heap)에 로드. (빈 방을 만든다)
		Address a2 = new Address();
		Address a3 = new Address();
		
		a1.setName("홍길동");
		a1.setAddr("서울");
		a1.setTel("02-0000");		
		
		a2.setName("정길동");
		a2.setAddr("인천");
		a2.setTel("032-0000");
		
		a3.setName("박길동");
		a3.setAddr("부산");
		a3.setTel("051-0000");
		
		System.out.println(a1); // a1.toString() 오버라이드 해놔서 알아서 잘 나옴.
		System.out.println(a2);
		System.out.println(a3);
		
		Address[] ar = new Address[3];
		ar[0] = new Address();
		ar[1] = new Address();
		ar[2] = new Address();
		
		for(Address res: ar) {
			System.out.println(res);
		}
		
		

	}

}

/*
 * 생성자
 * 1. 생성자는 반환형이 없고 클래스 이름과 동일하다.
 * 2. 오버로드 할 수 있다.
 * 3. 상속되지 않는다.
 * 4. 멤버변수 초기화의 목적을 가진다.
 * 5. 생성자를 명시하지 않으면 기본 생성자가 제공된다.
 * 6. 생성자를 명시하지 않으면 기본 생성자가 호출되어 객체가 생성되고 생성자를 명시하면 명시된 생성자가 호출된다.
 * 7. 생성자는 객체를 생성할 때 (new) 단 한번만 호출되어 생성된다.
 * */
