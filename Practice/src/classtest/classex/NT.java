package classtest.classex;

public class NT {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Person p1 = new Person();
		System.out.println(p1);
		
		Class pClass = Class.forName("classtest.classex.Person");
		Person p2 = (Person)pClass.newInstance();
		System.out.println(p2);
	}

}
