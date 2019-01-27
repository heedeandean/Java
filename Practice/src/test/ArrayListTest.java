package test;
import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<Book> library = new ArrayList<Book>();
		
		library.add(new Book("ÀÏ¹é»ê¸Æ", "Á¶Á¤·¡"));
		library.add(new Book("ÀÌ¹é»ê¸Æ", "Á¶Á¤·¡"));
		library.add(new Book("»ï¹é»ê¸Æ", "Á¶Á¤·¡"));
		library.add(new Book("»ç¹é»ê¸Æ", "Á¶Á¤·¡"));
		library.add(new Book("¿À¹é»ê¸Æ", "Á¶Á¤·¡"));

		for(int i=0; i<library.size(); i++) {
			Book book = library.get(i);
			book.showBookInfo();
		}
		
		System.out.println("===============");
		
		for(Book book : library) {
			book.showBookInfo();
		}
		
		

	}

}
