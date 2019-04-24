package test;

public class Constant {
	int num = 10;
	final int NUM = 100;
	
	public static void main(String[] args) {
		Constant c = new Constant();
		c.num = 50;
//		c.NUM = 200;
		
		System.out.println(c.num);
	}
}
