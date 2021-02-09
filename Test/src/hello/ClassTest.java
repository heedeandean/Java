package hello;

public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException {
		Person p = new Person();
		Class c = p.getClass();
		System.out.println(c.getName());
		
		Class p2 = Person.class;
		System.out.println(p2.getName());
		
		Class p3 = Class.forName("hello.Person");
		System.out.println(p3.getName());
	}

}
