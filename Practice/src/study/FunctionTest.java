package study;

public class FunctionTest {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		
		// add 함수 호출.
		int result = add(num1, num2);
		System.out.println(result);
		
		// subtract 함수 호출.
		result = subtract(num1, num2);
		System.out.println(result);
		
		// multiply 함수 호출.
		result = multiply(num1, num2);
		System.out.println(result);
		
		// divide 함수 호출.
		double result_div = divide(num1, num2);
		System.out.println(result_div);
	}
	
	
	// 사칙 연산 함수 만들기.
	// add 함수.
	public static int add(int n1, int n2) {
		int result = n1 + n2;
		return result;
	}
	
	// subtract 함수.
	public static int subtract(int n1, int n2) {
		int result = n1 - n2;
		return result;
	}
	
	// multiply 함수.
		public static int multiply(int n1, int n2) {
			int result = n1 * n2;
			return result;
		}
		
	// divide 함수.
	public static double divide(double n1, double n2) {
		double result = n1 / n2;
		return result;
	}
}
