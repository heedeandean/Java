package study;

public class Gugudan2 {

	public static void main(String[] args) {
		
		// �������� �ܺ��� ���ϴ� ���� �۰ų� ���� �������� ���.
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
