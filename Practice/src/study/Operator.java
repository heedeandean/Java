package study;

public class Operator {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 2;
		int result;
		char operator = '*';
		
//		// if-else 문
//		if(operator == '+') {
//			result = num1 + num2;
//		} 
//		else if(operator == '-') {
//			result = num1 - num2;
//		} 
//		else if(operator == '*') {
//			result = num1 * num2;
//		} 
//		else if(operator == '/') {
//			result = num1 /num2;
//		} 
//		else {
//			System.out.println("올바른 사칙 연산 기호가 아닙니다.");
//			return;
//		}
		
		// switch-case 문
		switch(operator) {
			case '+' : result = num1 + num2;
				break;
			case '-' : result = num1 - num2;
				break;
			case '*' : result = num1 * num2;
				break;
			case '/' : result = num1 / num2;
				break;
			default : 
				System.out.println("올바른 사칙 연산 기호가 아닙니다.");
				return;
		}
		
		System.out.println("결과는 " + result + "입니다.");
	}
}
