package hello;

public class StringEquals {

	public static void main(String[] args) {
		String s1 = new String("a");
		String s2 = new String("a");
		
		System.out.println(s1);
		System.out.println(System.identityHashCode(s1));
		
		s1 = s1.concat(s2);
		
		System.out.println(s1);
		System.out.println(System.identityHashCode(s1));
		
	}

}
