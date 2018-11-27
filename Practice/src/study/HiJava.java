package study;

public class HiJava {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		
		int result = add(num1, num2);
		System.out.println(result);
		
		result = minus(num1, num2);
		System.out.println(result);
		
		result = multiple(num1, num2);
		System.out.println(result);
		
		double result_div = div(num1, num2);
		System.out.println(result_div);
		
	}
	
	public static int add(int n1, int n2) {
		return n1 + n2;
	}
	
	public static int minus(int n1, int n2) {
		return n1 - n2;
	}
	
	public static int multiple(int n1, int n2) {
		return n1 * n2;
	}
	
	public static double div(double n1, double n2) {
		return n1 / n2;
	}
	
	
}
