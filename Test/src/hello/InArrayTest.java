package hello;

import java.util.Arrays;

public class InArrayTest {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		
		int sumVal = Arrays.stream(arr).sum();
		int cnt = (int)Arrays.stream(arr).count();
		System.out.println(sumVal);
		System.out.println(cnt);
	}

}
