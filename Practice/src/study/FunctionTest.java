package study;

public class FunctionTest {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		
		// add �Լ� ȣ��.
		int result = add(num1, num2);
		System.out.println(result);
		
		// subtract �Լ� ȣ��.
		result = subtract(num1, num2);
		System.out.println(result);
		
		// multiply �Լ� ȣ��.
		result = multiply(num1, num2);
		System.out.println(result);
		
		// divide �Լ� ȣ��.
		double result_div = divide(num1, num2);
		System.out.println(result_div);
	}
	
	
	// ��Ģ ���� �Լ� �����.
	// add �Լ�.
	public static int add(int n1, int n2) {
		int result = n1 + n2;
		return result;
	}
	
	// subtract �Լ�.
	public static int subtract(int n1, int n2) {
		int result = n1 - n2;
		return result;
	}
	
	// multiply �Լ�.
		public static int multiply(int n1, int n2) {
			int result = n1 * n2;
			return result;
		}
		
	// divide �Լ�.
	public static double divide(double n1, double n2) {
		double result = n1 / n2;
		return result;
	}
}
