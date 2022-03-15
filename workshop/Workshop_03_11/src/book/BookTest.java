package book;

public class BookTest {

	public static void main(String[] args) {
		Book b1 = new Book("SQL Plus", 50000, 5.0);
		Book b2 = new Book("Java 2.0", 40000, 3.0);
		Book b3 = new Book("JSP Servlet", 60000, 6.0);

		System.out.println("책이름\t\t 가격\t\t 할인율\t 할인후금액");
		System.out.println("-----------------------------------------------");
		System.out.printf("%s \t %d원 \t %.1f%% \t %.1f원 %n",
				b1.getBookName(), b1.getBookPrice(), b1.getBookDiscountRate(), b1.getDiscountBookPrice());
		System.out.printf("%s \t %d원 \t %.1f%% \t %.1f원 %n",
				b2.getBookName(), b2.getBookPrice(), b2.getBookDiscountRate(), b2.getDiscountBookPrice());
		System.out.printf("%s \t %d원 \t %.1f%% \t %.1f원 %n",
				b3.getBookName(), b3.getBookPrice(), b3.getBookDiscountRate(), b3.getDiscountBookPrice());
	}

}
