package classtest.array;

public class Student {
	private int stuID;
	private String name;
	
	public Student(int stuID, String name) {
		this.stuID = stuID;
		this.name = name;
	}

	public int getStuID() {
		return stuID;
	}

	public void setStuID(int stuID) {
		this.stuID = stuID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void showStudentInfo() {
		System.out.println(stuID + ", " + name);
	}
}
