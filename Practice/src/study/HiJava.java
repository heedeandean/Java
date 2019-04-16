package study;

public class HiJava {
	public static void main(String[] args) {
		char o = '/';
		float n1 = 10;
		float n2 = 4;
		float result;
		
		switch (o) {
		 case '+' : result = n1 + n2;
		 	break;
		 case '-' : result = n1 - n2;
		 	break;
		 case '*' : result = n1 * n2;
		 	break;
		 case '/' : result = n1 / n2;
		 	break;
		 default:
			 System.out.println("올바른 사칙연산이 아닙니다.");
			 return;
		}
		
		System.out.println("결과는 " + result + "입니다.");

		test
	}
}
