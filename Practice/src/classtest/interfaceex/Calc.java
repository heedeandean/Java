package classtest.interfaceex;

public interface Calc {
	double PI = 3.14;
	int ERROR = -99999999;
	
	int add(int n1, int n2);
	int sub(int n1, int n2);
	int mul(int n1, int n2);
	int div(int n1, int n2);
	int square(int n1);
	
	// 디폴트 메서드
	default void description() {
		System.out.println("정수 계산기를 구현합니다.");
	}
	
	// 정적 메서드
	static int total(int[] arr) {
		int total = 0;
		
		for(int i : arr) {
			total += i;
		}
		
		return total;
	}
}
