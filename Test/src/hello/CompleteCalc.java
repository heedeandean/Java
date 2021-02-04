package hello;

public class CompleteCalc extends Calculator {

	@Override
	public int times(int n1, int n2) {
		return n1 * n2;
	}

	@Override
	public int divide(int n1, int n2) {
		if(n2 != 0)
			return n1/n2;
		else
			return Calc.ERROR;
	}
	
	public void showInfo() {
		System.out.println("Calc 인터페이스 구현");
	}

	@Override
	public int square(int n1) {
		return n1 * n1;
	}

}
