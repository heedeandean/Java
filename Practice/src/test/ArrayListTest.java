package test;
import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<Book> library = new ArrayList<Book>();
		
		library.add(new Book("�Ϲ���", "������"));
		library.add(new Book("�̹���", "������"));
		library.add(new Book("�����", "������"));
		library.add(new Book("�����", "������"));
		library.add(new Book("������", "������"));

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
