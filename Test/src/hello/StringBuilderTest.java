package hello;

public class StringBuilderTest {

	public static void main(String[] args) {
		String s1 = new String("a");
		System.out.println(System.identityHashCode(s1));
	
		StringBuilder b = new StringBuilder(s1);
		System.out.println(System.identityHashCode(b));
		b.append("b");
		b.append("c");
		b.append("d");
		System.out.println(System.identityHashCode(b));
		
		
		s1 = b.toString();
		System.out.println(s1);
		System.out.println(System.identityHashCode(s1));
	}

}
