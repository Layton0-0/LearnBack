package com.sample1;

//멤버변수 2, 기본생성자 1, 매개인자 생성자 1
public class MessageImpl implements MessageBean {

	private String fruit;
	private int cost;
	
	
	public MessageImpl() {
		super();
		this.fruit = "pear";
		this.cost = 5000;
				
	}

	public MessageImpl(String fruit, int cost) {
		super();
		this.fruit = fruit;
		this.cost = cost;
	}




	@Override
	public void sayHello() {

		System.out.println(this.fruit + "\t" + this.cost);

	}

}
