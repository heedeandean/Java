package test;

class Book {
	int bookNum;
	String bookTitle;
	
	Book(int bookNum, String bookTitle) {
		this.bookNum = bookNum;
		this.bookTitle = bookTitle;
	}

	@Override
	public String toString() {
		return bookTitle + ", " + bookNum;
	}
}

public class ToStringEx {

	public static void main(String[] args) {
		Book b1 = new Book(1, "개발자가 되즈아");
		
		System.out.println(b1);
		System.out.println(b1.toString());
	}
}
