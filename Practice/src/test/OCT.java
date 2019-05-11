package test;

class Point {
	int x;
	int y;
	
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "x = " + x + ", y = " + y;
	}
}

class Circle implements Cloneable {
	Point point;
	int r;
	
	Circle(int x, int y, int r) {
		this.r = r;
		point = new Point(x, y);
	}
	
	public String toString() {
		return "원점은 " + point + "이고, 반지름은 " + r + "입니다.";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

public class OCT {

	public static void main(String[] args) throws CloneNotSupportedException {
		Circle cir = new Circle(10, 20, 30);
		Circle copyCir = (Circle)cir.clone();
		
		System.out.println(cir);
		System.out.println(copyCir);
		
		System.out.println(System.identityHashCode(cir));
		System.out.println(System.identityHashCode(copyCir));
	}

}
