package bookSpring;

public class Book {
	private String bookName;
	private int bookPrice;
	private double bookDiscountRate;
	
	public Book() {
		super();
		
	}

	public Book(String bookName, int bookPrice, double bookDiscountRate) {
		super();
		this.bookName = bookName;
		this.bookPrice = bookPrice;
		this.bookDiscountRate = bookDiscountRate;
	}
	
	public double getDiscountBookPrice() {
		bookPrice -= bookPrice * (bookDiscountRate/100);
		return bookPrice;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public int getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}

	public double getBookDiscountRate() {
		return bookDiscountRate;
	}

	public void setBookDiscountRate(double bookDiscountRate) {
		this.bookDiscountRate = bookDiscountRate;
	}

	@Override
	public String toString() {
		return bookName + "\t" + bookPrice + "원\t\t" + bookDiscountRate + "%\t" + getDiscountBookPrice() + "원"; 
	}

	
}
