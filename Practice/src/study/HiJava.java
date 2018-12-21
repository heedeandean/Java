package study;

public class HiJava {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		
		int result = add(num1, num2);
		System.out.println(result);
		
		result = sub(num1, num2);
		System.out.println(result);
		
		result = mul(num1, num2);
		System.out.println(result);
		
		double result_div = div(num1, num2);
		System.out.println(result_div);

	}
	
	public static int add(int n1, int n2) {
		int result = n1 + n2;
		return result;
	}
	
	public static int sub(int n1, int n2) {
		int result = n1 - n2;
		return result;
	}
	
	public static int mul(int n1, int n2) {
		int result = n1 * n2;
		return result;
	}
	
	public static double div(double n1, double n2) {
		double result = n1 / n2;
		return result;
	}
}
