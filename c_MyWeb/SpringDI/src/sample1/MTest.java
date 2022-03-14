package sample1;

public class MTest {
	public static void main(String[] args) {
		
		
		MessageBean mi = new MessageImpl();
		mi.sayHello();
		
		
		MessageBean mi02 = new MessageImpl("melon", 7000);
		mi02.sayHello();
	}
}
