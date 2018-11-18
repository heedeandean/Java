package classtest;

public class Person {
	
	// 클래스 멤버 변수.
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
		
		System.out.println("나이 : " + h.age);
		System.out.println("이름 : " + h.name);
		System.out.println("결혼 여부 : " + h.isMarried);
		System.out.println("자녀 수 : " + h.children);
	}
}
