package hello;

class Point {
	int x;
	int y;
	
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return x + "," + y;
	}
	
	
}

class Circle implements Cloneable {
	Point p;
	int r;
	
	Circle(int x, int y, int r) {
		this.r = r;
		p = new Point(x, y);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public String toString() {
		return p + "," + r;
	}
}
	

public class OCT {

	public static void main(String[] args) throws CloneNotSupportedException {
		Circle c = new Circle(10, 20, 30);
		Circle cc = (Circle)c.clone();
		
		System.out.println(c);
		System.out.println(cc);
		System.out.println(System.identityHashCode(c));
		System.out.println(System.identityHashCode(cc));
	}

}
