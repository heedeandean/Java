package test;

import java.util.HashSet;

public class ST {

	public static void main(String[] args) {
		HashSet<Stu> set = new HashSet<Stu>();

		set.add(new Stu("1", "김일수"));
		set.add(new Stu("2", "김이수"));
		set.add(new Stu("3", "김삼수"));
		set.add(new Stu("4", "김사수"));
		set.add(new Stu("1", "김오수"));

		System.out.println(set);
	}

}
