package hello;

public class Student {
	private String stuID;
	private String name;
	
	public Student() {}
	
	public Student(String stuID, String name) {
		this.stuID = stuID;
		this.name = name;
	}

	public String getstuID() {
		return stuID;
	}

	public void setstuID(String stuID) {
		this.stuID = stuID;
	}

	public String getname() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}
	
	public void showStudentInfo() {
		System.out.println(stuID + ", " + name);
	}
}
