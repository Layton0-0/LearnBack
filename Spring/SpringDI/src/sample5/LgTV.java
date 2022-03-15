package sample5;

public class LgTV implements TV {

	
	public LgTV() {
		super();
		System.out.println("LgTV 객체가 생성되었어요...");
	}

	public void powerOn() {
		System.out.println("LgTV --- 전원을 켠다.");

	}

	
	public void powerOff() {
		System.out.println("LgTV --- 전원을 끈다.");

	}

	
	public void volumnUp() {
		System.out.println("LgTV --- 소리를 높인다.");

	}

	
	public void volumnDown() {
		System.out.println("LgTV --- 소리를 낮춘다.");

	}

}
