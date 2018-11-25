package study;

public class HiTest {

	public static void main(String[] args) {
		HiJava date1 = new HiJava(30, 2, 2000);
		System.out.println(date1.isValid());
		
		HiJava date2 = new HiJava(2, 10, 2006);
		System.out.println(date2.isValid());

	}

}
