package com.test;
/* 
이름	주소	전화번호		Address	(name, addr, tel)
홍길동	서울	02-0000		a1
정길동	인천	032-0000	a2
박길동	부산	051-0000	a3
*/
public class MAddress {

	public static void main(String[] args) {
		// 메모리맵(메모리영역) -> ds(data segment), cs(code segment), static(정적), heap(동적), stack(고정)
		Address a1 = new Address(); // new -> 객체를 생성자를 통해서 생성하면서 메모리(자유영역공간 heap)에 로드. (빈 방을 만든다)
		Address a2 = new Address();
		Address a3 = new Address();
		
		a1.setName("홍길동");
		a1.setAddr("서울");
		a1.setTel("02-0000");		
		
		a1.setName("정길동");
		a1.setAddr("인천");
		a1.setTel("032-0000");
		
		a1.setName("박길동");
		a1.setAddr("부산");
		a1.setTel("051-0000");
		
		System.out.println(a1); // a1.toString() 오버라이드 해놔서 알아서 잘 나옴.
		System.out.println(a2);
		System.out.println(a3);
		
		

	}

}
