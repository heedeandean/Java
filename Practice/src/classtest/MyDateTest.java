package classtest;

public class MyDateTest {
	public static void main(String[] args) {
		MyDate date1 = new MyDate(11, 4, 1994);
		System.out.println(date1.isValid());
		
		MyDate date2 = new MyDate(30, 2, 2018);
		System.out.println(date2.isValid());
	}
}
