package hello;

class Outer2 {
	Runnable getRunnable(int i) {
		int num = 100;
		
		return new Runnable() {
			
			@Override
			public void run() {
				System.out.println(i);
				System.out.println(num);
			}
		};
	}
	Runnable rr = new Runnable() {
		
		@Override
		public void run() {
		
			System.out.println("Runnable 이 구현된 익명 클래스 변수");
		}
	};
}

public class AnonymousInnerTest {

	public static void main(String[] args) {
		Outer2 o = new Outer2();
		Runnable r = o.getRunnable(10);
		r.run();
		o.rr.run();
	}

}
