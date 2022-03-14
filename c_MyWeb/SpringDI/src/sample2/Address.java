package sample2;

public class Address {

	private String name;
	private String addr;
	private String tel;
	
	private Address() {
		super();
		System.out.println("기본생성자");
	}
	
	private Address(String name, String addr, String tel) {
		super();
		this.name = name;
		this.addr = addr;
		this.tel = tel;
		System.out.println("매개인자생성자");
	}

	public String getName() {
		return name;
	}

	public String getAddr() {
		return addr;
	}

	public String getTel() {
		return tel;
	}

	

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Address [name=" + name + ", addr=" + addr + ", tel=" + tel + "]";
	}

	

}
