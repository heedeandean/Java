package test;

public class Test {

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 20;

		int sum = add(num1, num2);
		System.out.println(num1 + " + " + num2 + " = " + sum + "입니다.");

		int minus = minus(num1, num2);
		System.out.println(num1 + " - " + num2 + " = " + minus + "입니다.");

		int multiplied = multiplied(num1, num2);
		System.out.println(num1 + " * " + num2 + " = " + multiplied + "입니다.");

		double div = div(num1, num2);
		System.out.println(num1 + " / " + num2 + " = " + div + "입니다.");

	}

	public static int add(int n1, int n2) {
		int result = n1 + n2;
		return result;
	}

	public static int minus(int n1, int n2) {
		int result = n1 - n2;
		return result;
	}

	public static int multiplied(int n1, int n2) {
		int result = n1 * n2;
		return result;
	}

	public static double div(double n1, double n2) {
		double result = n1 / n2;
		return result;
	}

}
