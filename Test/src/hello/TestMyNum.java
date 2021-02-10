package hello;

public class TestMyNum {

	public static void main(String[] args) {
		MyNum max = (x, y) -> (x>=y) ? x : y;
		System.out.println(max.getMax(10, 20));
		
		Calc c  = (x, y) -> (x + y);
		System.out.println(c.add(80, 20));
	}

}
