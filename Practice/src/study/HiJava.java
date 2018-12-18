package study;

public class HiJava {
	public static void main(String[] args) {
		for (int dan=2; dan<=9; dan++) {
			for (int times=1; times<=9; times++) {
				if (dan < times)
					break;
				System.out.println(dan + " x " + times + " = " + (dan * times));
			}
			System.out.println();
		}
	}
}
