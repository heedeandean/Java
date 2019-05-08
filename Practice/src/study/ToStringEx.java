package study;

class Student {
	int stuID;
	String stuName;
	
	Student(int stuID, String stuName) {
		this.stuID = stuID;
		this.stuName = stuName;
	}

	@Override
	public String toString() {
		return stuName + ", " + stuID;
	}
}

public class ToStringEx {

	public static void main(String[] args) {
		Student stu = new Student(1, "heedean");
		
		System.out.println(stu);
		System.out.println(stu.toString());
	}
}
