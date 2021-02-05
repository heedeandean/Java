package hello;

public class StringEquals {

	public static void main(String[] args) {
		String s1 = new String("a");
		String s2 = new String("a");
		
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		
		Integer i1 = new Integer(1);
		Integer i2 = new Integer(1);
		
		System.out.println(i1 == i2);
		System.out.println(i1.equals(i2));
	}

}
