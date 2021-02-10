package hello;

class Outer {
	int outNum = 100;
	static int sNum = 200;
	
	Runnable getRunnable(int i) {
		int num = 100;
		
		class MyRunnable implements Runnable {
			int localNum = 10;

			@Override
			public void run() {
				System.out.println(i);
				System.out.println(num);
				System.out.println(localNum);
				System.out.println(outNum);
				System.out.println(Outer.sNum);
			}
			
		}
		return new MyRunnable();
	}
}

public class LocalInnerTest {

	public static void main(String[] args) {
		Outer o = new Outer();
		Runnable r = o.getRunnable(10);
		r.run();
	}

}
