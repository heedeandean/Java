package test;

public class ST {

	public static void main(String[] args) {
		String s1 = new String("HEEJIN");
		String s2 = new String("HEEJIN");
		
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		
		String s3 = "존버가 답";
		String s4 = "존버가 답";
	
		System.out.println(s3 == s4);
		System.out.println(s3.equals(s4));
	}

}
