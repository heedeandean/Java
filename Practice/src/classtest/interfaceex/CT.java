package classtest.interfaceex;

public class CT {

	public static void main(String[] args) {

		int n1 = 10;
		int n2 = 5;

		CompleteCalc calc = new CompleteCalc();
		System.out.println(calc.add(n1, n2));
		System.out.println(calc.sub(n1, n2));
		System.out.println(calc.mul(n1, n2));
		System.out.println(calc.div(n1, n2));
		System.out.println(calc.square(n1));

		calc.showInfo();
		calc.description();

		int[] arr = { 1, 2, 3, 4, 5 };
		System.out.println(Calc.total(arr));
	}
}
