package hello;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStreamTest {

	public static void main(String[] args) {
		List<String> l = new ArrayList<String>();
		l.add("일수");
		l.add("이수");
		l.add("삼수");
		
		Stream<String> st = l.stream();
		st.forEach(s->System.out.print(s + " "));

		System.out.println();
		l.stream().sorted().forEach(s->System.out.print(s));
	}

}
