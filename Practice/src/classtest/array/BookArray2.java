package classtest.array;

public class BookArray2 {

	public static void main(String[] args) {
		Book[] library = new Book[5];
		
		library[0] = new Book("�¹���", "������");
		library[1] = new Book("�¹���", "������");
		library[2] = new Book("�¹���", "������");
		library[3] = new Book("�¹���", "������");
		library[4] = new Book("�¹���", "������");
		
		for(int i=0; i<library.length; i++) {
			library[i].showBookInfo();
		}
	
		for(int i=0; i<library.length; i++) {
			System.out.println(library[i]);
		}
	}

}
