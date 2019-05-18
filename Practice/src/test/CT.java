package test;

import classtest.classex.Person;

public class CT {

	public static void main(String[] args) throws ClassNotFoundException {
		Person p = new Person();
		Class pClass1 = p.getClass();
		System.out.println(pClass1.getName());
		
		Class pClass2 = Person.class;
		System.out.println(pClass2.getName());
		
		Class pClass3 = Class.forName("test.Person");
		System.out.println(pClass3.getName());
	}
}
