package book;

public class BookTest {

	public static void main(String[] args) {
		Book[] book = new Book[3];
		book[0] = new Book("SQL Plus", 50000, 5.0);
		book[1] = new Book("Java 2.0", 40000, 3.0);
		book[2] = new Book("JSP Servlet", 60000, 6.0);

		System.out.println("å�̸�\t\t����\t������\t�����ıݾ�");
		System.out.println("----------------------------------------");
		
		System.out.print(book[0].getBookName()+"\t");
		System.out.print(book[0].getBookPrice()+"��\t");
		System.out.print(book[0].getBookDiscountRate()+"%\t");
		System.out.print(book[0].getBookPrice()-book[0].getBookDiscountRate()*0.01*book[0].getBookPrice()+"��");
		
		System.out.print("\n"+book[1].getBookName()+"\t");
		System.out.print(book[1].getBookPrice()+"��\t");
		System.out.print(book[1].getBookDiscountRate()+"%\t");
		System.out.print(book[1].getBookPrice()-book[0].getBookDiscountRate()*0.01*book[0].getBookPrice()+"��");
		
		System.out.print("\n"+book[2].getBookName()+"\t");
		System.out.print(book[2].getBookPrice()+"��\t");
		System.out.print(book[2].getBookDiscountRate()+"%\t");
		System.out.print(book[2].getBookPrice()-book[0].getBookDiscountRate()*0.01*book[0].getBookPrice()+"��");
		
		

	}

}
