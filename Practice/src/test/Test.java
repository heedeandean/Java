package test;

public class Test {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setStuName("김일수");
		System.out.println(Student.getSerialNum());
		System.out.println(s1.sutCardID);

		Student s2 = new Student();
		s2.setStuName("김이수");
		System.out.println(Student.getSerialNum());
		System.out.println(s2.sutCardID);

	}

}
