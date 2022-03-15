package sample1;

public class MessageImpl implements MessageBean {
	private String fruit;
	private int cost;

	public MessageImpl() {
		super();
		this.fruit = "strawberry";
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
