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
	
	@Override
	public int square(int n1) {
		return n1 * n1;
	}

	public void showInfo() {
		System.out.println("Calc 인터페이스 구현");
	}

	@Override
	public void description() {
//		super.description();
		System.out.println("디폴드 메서드 재정의");
	}
}
