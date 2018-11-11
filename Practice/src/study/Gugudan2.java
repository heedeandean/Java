package study;

public class Gugudan2 {

	public static void main(String[] args) {
		
		// 구구단을 단보다 곱하는 수가 작거나 같은 경우까지만 출력.
		int dan;
		int times;
		
		for(dan=2; dan<=9; dan++) {
			for(times=1; times<=9; times++) {
				if(times > dan)
					break;
				System.out.println(dan + " x " + times + " = " + dan * times);
			}
			System.out.println();
		}
	}
}
