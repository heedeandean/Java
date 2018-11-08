package study;

public class HiJava {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 2;
		
		char operator = '*';
		
		if(operator == '+') {
			System.out.println(num1 + num2);
		}
		else if(operator == '-') {
			System.out.println(num1 - num2);
		}
		else if(operator == '*') {
			System.out.println(num1 * num2);
		}
		else if(operator == '/') {
			System.out.println(num1 / num2);
		}
		else {
			System.out.println("존재하지 않는 사칙연산");
		}

	}
}
