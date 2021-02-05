package hello;

class Book {
	int bookNum;
	String bookTitle;
	Book(int bookNum, String bookTitle) {
		this.bookNum = bookNum;
		this.bookTitle = bookTitle;
	}

	@Override
	public String toString() {
		return bookTitle + "," + bookNum;
	
}

}

public class ToStringEx {
	public static void main(String[] args) {
		Book b = new Book(200, "개미");
		System.out.println(b);
		System.out.println(b.toString());
	}

}
