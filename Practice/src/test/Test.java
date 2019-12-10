package test;

class Student {
	private String stuID;
	private String name;

	public Student() {
	}

	public Student(String stuID, String name) {
		this.stuID = stuID;
		this.name = name;
	}

	public String getStuID() {
		return stuID;
	}

	public void setStuID(String stuID) {
		this.stuID = stuID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void showStuInfo() {
		System.out.println(stuID + ", " + name);
	}

}

public class Test {

	public static void main(String[] args) {
		Student[] library = new Student[3];

		library[0] = new Student("1001", "김일수");
		library[1] = new Student("1002", "김이수");
		library[2] = new Student("1003", "김삼수");

		for (int i = 0; i < library.length; i++) {
			library[i].showStuInfo();
		}
		for (int i = 0; i < library.length; i++) {
			System.out.println(library[i]);
		}
	}

}
