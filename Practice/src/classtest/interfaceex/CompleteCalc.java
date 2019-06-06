package classtest.interfaceex;

public class CompleteCalc extends Calculator {

	@Override
	public int mul(int n1, int n2) {
		return n1 * n2;
	}

	@Override
	public int div(int n1, int n2) {
		if(n2 != 0)
			return n1 / n2;
		else
			return Calc.ERROR;
	}
	
	public void showInfo() {
		System.out.println("Calc 인터페이스 구현");
	}
}
