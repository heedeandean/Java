package hello;

public class MyDateTest {
	
	public static void main(String[] args) {
		MyDate d1 = new MyDate(30, 2, 2000);
		System.out.println(d1.isValid());
		MyDate d2 = new MyDate(2, 10, 2022);
		System.out.println(d2.isValid());
	}
}
