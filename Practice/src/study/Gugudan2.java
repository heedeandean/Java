package study;

public class Gugudan2 {

	public static void main(String[] args) {
		
		// 구구단을 단보다 곱하는 수가 작거나 같은 경우까지만 출력.
		for(int dan=2; dan<=9; dan++) {
			for(int times=1; times<=dan; times++) {
				System.out.println(dan + " * " + times + " = " + (dan * times));
			}
			System.out.println();
		}
	}
}
