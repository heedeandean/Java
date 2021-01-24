package hello;

public class BookArray {

	public static void main(String[] args) {
		Book[] b1 = new Book[3];
		Book[] b2 = new Book[3];
		
		b1[0] = new Book("태백산맥", "조정래");
		b1[1] = new Book("데미안", "헤르만 헤세");
		b1[2] = new Book("어떻게 살 것인가", "유시민");
		
		b2[0] = new Book();
		b2[1] = new Book();
		b2[2] = new Book();
				
		for(int i=0; i<b2.length; i++) {
			b2[i].setBookName(b1[i].getBookName());
			b2[i].setAuthor(b1[i].getAuthor());
		}
		
		for(int i=0; i<b2.length; i++) {
			b2[i].showBookInfo();
		}
		System.out.println();
		b1[0].setBookName("나목");
		b1[0].setAuthor("박완서");
		System.out.println();
		
		for(int i=0; i<b2.length; i++) {
			b2[i].showBookInfo();
		}
		
	}
}
