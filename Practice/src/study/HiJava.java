package study;

class Person {
	String name;
	int age;
	
	Person() {
		this("¾öÈñÁø", 25);
	}
	
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	Person returnItSelf() {
		return this;
	}
}
	
public class HiJava {
	public static void main(String[] args) {
		Person hee = new Person();
		System.out.println(hee.name);
		System.out.println(hee.age);
		
		Person p = hee.returnItSelf();
		System.out.println(p);
		System.out.println(hee);
	}
}
