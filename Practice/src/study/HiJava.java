package study;

public class HiJava {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 2;
		
		char operator = '*';
		
		switch(operator) {
			case '+' : System.out.println(num1 + num2);
			break;
			case '-' : System.out.println(num1 - num2);
			break;
			case '*' : System.out.println(num1 * num2);
			break;
			case '/' : System.out.println(num1 / num2);
			break;
			
			default : System.out.println("존재하지 않는 사칙 연산 기호");
			break;
		}

	}
}
