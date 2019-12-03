package test;

public class Test {

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 2;
		char operator = '*';
		int result;

//		if (operator == '+') {
//			result = num1 + num2;
//		} else if (operator == '-') {
//			result = num1 - num2;
//		} else if (operator == '*') {
//			result = num1 * num2;
//		} else if (operator == '/') {
//			result = num1 / num2;
//		} else {
//			System.out.println("존재하는 사칙연산이 아닙니다.");
//			return;
//		}

		switch (operator) {
		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 - num2;
			break;
		case '*':
			result = num1 * num2;
			break;
		case '/':
			result = num1 / num2;
			break;
		default:
			System.out.println("존재하는 사칙연산이 아닙니다.");
			return;
		}
		System.out.println(result);

	}

}
