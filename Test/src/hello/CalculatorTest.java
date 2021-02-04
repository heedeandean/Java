package hello;

public class CalculatorTest {

	public static void main(String[] args) {
		int n1 = 10;
		int n2 = 2;
		
		CompleteCalc c = new CompleteCalc();
		System.out.println(c.add(n1, n2));
		System.out.println(c.sub(n1, n2));
		System.out.println(c.times(n1, n2));
		System.out.println(c.divide(n1, n2));
		System.out.println(c.square(n1));
		c.showInfo();
		c.description();
		
		int[] arr = {1,2,3,4,5};
		System.out.println(Calc.total(arr));
	}

}
