package hello;

public interface Calc {
	double PI = 3.14;
	int ERROR = -999999999;
	
	int add(int n1, int n2);
	int sub(int n1, int n2);
	int times(int n1, int n2);
	int divide(int n1, int n2);
	int square(int n1);
	
	default void description() {
		System.out.println("정수 계산기 구현");
		myMethod();
	}
	
	static int total(int[] arr) {
		int total = 0;
		for(int i : arr) {
			total += i;
		}
		myStaticMethod();
		return total;
	}
	
	private void myMethod() {
		System.out.println("private 메서드");
	}
	
	private static void myStaticMethod() {
		System.out.println("private static 메서드");
	}
	
}
