package hello;

import java.util.Arrays;
import java.util.function.BinaryOperator;

class CompareString implements BinaryOperator<String> {

	@Override
	public String apply(String s1, String s2) {
		if(s1.getBytes().length >= s2.getBytes().length) return s1;
		else return s2;
	}
	
}

public class ReduceTest {

	public static void main(String[] args) {
		String[] g = {"11111", "222222222", "333333333"};
		System.out.println(Arrays.stream(g).reduce("", (s1, s2) -> {if(s1.getBytes().length >= s2.getBytes().length) return s1; else return s2;}));
		
		String s = Arrays.stream(g).reduce(new CompareString()).get();
		System.out.println(s);
	}

}
