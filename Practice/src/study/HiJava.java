package study;

class Person {
	String name;
	int age;
	
	Person() {
		
		this("������", 25);
		this.name = "����";
	}
	
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
}
	
public class HiJava {
	public static void main(String[] args) {
		Person hee = new Person();
		System.out.println(hee.name);
		System.out.println(hee.age);
	}
}
