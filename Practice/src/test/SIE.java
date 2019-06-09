package test;

public class SIE {
	public static void main(String[] args) {
		String s1 = new String("희진");
		String s2 = new String("희진");
		
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		
		Integer i1 = new Integer(24);
		Integer i2 = new Integer(24);
	
		System.out.println(i1 == i2);
		System.out.println(i1.equals(i2));
	}
}
