package hello;

public class TestStringConcat {

	public static void main(String[] args) {
		String s1 = "hi";
		String s2 = "hee";
		StringConcat c = (s, v) -> System.out.println(s + "," + v);
		c.makeString(s1, s2);
	}

}
