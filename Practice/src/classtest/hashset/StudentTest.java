package classtest.hashset;

import java.util.HashSet;

public class StudentTest {
	public static void main(String[] args) {
		HashSet<Student> hs = new HashSet<Student>();

		hs.add(new Student("1", "김일수"));
		hs.add(new Student("2", "김이수"));
		hs.add(new Student("3", "김이수"));
		hs.add(new Student("4", "김이수"));
		hs.add(new Student("1", "중복"));

		System.out.println(hs);
	}
}
