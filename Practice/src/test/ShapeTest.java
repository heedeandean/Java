package test;

import java.util.ArrayList;;

class Shape {
	public void draw() {
		System.out.println("모양");
	}
}

class Circle extends Shape {
	public void draw() {
		System.out.println("원");
	}
}

class Triangle extends Shape {
	public void draw() {
		System.out.println("트라이앵글");
	}
}

public class ShapeTest {
	public static void main(String[] args) {
		ArrayList<Shape> sList = new ArrayList<Shape>();
		
		sList.add(new Circle());
		sList.add(new Triangle());
		sList.add(new Shape());
		
		for(Shape s : sList) {
			s.draw();
		}
	}

}
