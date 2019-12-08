package test;

class Person {
	String name;
	int age;
	
	Person() {
		this("희딘딘", 20);
	}
	
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	Person returnItSelf() {
		return this;
	}
}
	
public class Test {
	public static void main(String[] args) {
		Person h = new Person();
		System.out.println(h.name);
		System.out.println(h.age);
		
		Person p = h.returnItSelf();
		System.out.println(p);
		System.out.println(h);
		
	}
	
}

