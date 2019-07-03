package classtest.array;

public class ArrayTest {

	public static void main(String[] args) {

		int[] evenNum = { 2, 4, 6, 8, 10 };
		int total = 0;

		for (int i = 0; i < evenNum.length; i++) {
			total += evenNum[i];
		}

		System.out.println("total : " + total);
	}
}
