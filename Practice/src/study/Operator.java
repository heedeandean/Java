package study;

public class Operator {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 2;
		int result;
		char operator = '*';
		
//		// if-else ��
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
//			System.out.println("�ùٸ� ��Ģ ���� ��ȣ�� �ƴմϴ�.");
//			return;
//		}
		
		// switch-case ��
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
				System.out.println("�ùٸ� ��Ģ ���� ��ȣ�� �ƴմϴ�.");
				return;
		}
		
		System.out.println("����� " + result + "�Դϴ�.");
	}
}