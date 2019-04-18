package test;

import java.util.ArrayList;;

class Shape {
	public void draw() {
		System.out.println("���");
	}
}

class Circle extends Shape {
	public void draw() {
		System.out.println("��");
	}
}

class Triangle extends Shape {
	public void draw() {
		System.out.println("Ʈ���̾ޱ�");
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
