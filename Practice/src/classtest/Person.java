package classtest;

public class Person {
	
	// Ŭ���� ��� ����.
	int age;
	String name;
	boolean isMarried;
	int children;
	
	public static void main(String[] args) {
		Person h = new Person();
		
		h.age = 25;
		h.name = "heejin";
		h.isMarried = false;
		h.children = 0;
		
		System.out.println("���� : " + h.age);
		System.out.println("�̸� : " + h.name);
		System.out.println("��ȥ ���� : " + h.isMarried);
		System.out.println("�ڳ� �� : " + h.children);
	}
}
