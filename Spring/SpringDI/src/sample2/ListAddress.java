package sample2;

public class ListAddress{
private Address addr;

public ListAddress() {
	super();
	System.out.println("Listaddress 기본생성자 ");
}

public ListAddress(Address addr) {
	super();
	this.addr = addr;
	System.out.println("Listaddress 매개인자 생성자 ");
}

public Address getAddr() {
	return addr; //addr.toString();
}

public void setAddr(Address addr) {
	this.addr = addr;
}


}
