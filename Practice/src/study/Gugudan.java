package study;

public class Gugudan {

	public static void main(String[] args) {
		
		// 짝수 단 출력.
		for(int dan=2; dan<=8; dan++) {
			if(dan % 2 != 0)
				continue;
			for(int times=1; times<=9; times++) {
				System.out.println(dan + " * " + times + " = " + (dan * times));
			}
			System.out.println();
		}
	}
}
