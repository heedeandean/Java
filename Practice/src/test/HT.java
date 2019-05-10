package test;

public class HT {
	public static void main(String[] args) {
		String s1 = new String("hee");
		String s2 = new String("hee");
	
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);
		
		System.out.println(i1.hashCode());
		System.out.println(i2.hashCode());
	}
}
