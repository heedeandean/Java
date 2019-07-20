package test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {
		List<String> sList = new ArrayList<String>();
		sList.add("희딘");
		sList.add("영신");
		sList.add("유나");

		Stream<String> stream = sList.stream();
		stream.forEach(s -> System.out.println(s + " "));

		System.out.println();

		sList.stream().sorted().forEach(s -> System.out.println(s));

	}

}
