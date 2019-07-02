package test;

public class ST {

	public static void main(String[] args) {
		String s1 = "hihi";
		String s2 = "heedeandean";
		
		CC c1 = new CC();
		c1.makeString(s1, s2);
		
		// 람다식
		StringConcat c2 = (s, v) -> System.out.println(s + ", " + v);
		c2.makeString(s1, s2);
		
	}

}
