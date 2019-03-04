package study;

public class Gugudan {

	public static void main(String[] args) {
		
		// Â¦¼ö ´Ü Ãâ·Â.
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
