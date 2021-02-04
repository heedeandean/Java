package hello;

public class BookShelfTest {

	public static void main(String[] args) {
		Q sq = new BookShelf();
		sq.enQ("1");
		sq.enQ("2");
		sq.enQ("3");
		
		System.out.println(sq.deQ());
		System.out.println(sq.deQ());
		System.out.println(sq.deQ());
	}

}
