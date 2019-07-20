package test;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4 };

		int sumVal = Arrays.stream(arr).sum();
		int count = (int) Arrays.stream(arr).count();

		System.out.println(sumVal);
		System.out.println(count);
	}

}
