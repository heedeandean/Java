package hello;

public class NewInstanceTest {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Person p = new Person();
		System.out.println(p);
		
		Class c = Class.forName("hello.Person");
		Person p2 = (Person)c.newInstance();
		System.out.println(p2);
	}

}
