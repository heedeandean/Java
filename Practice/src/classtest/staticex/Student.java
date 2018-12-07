package classtest.staticex;

public class Student {
	public static int serialNum = 0;
	public int stuID;
	public String stuName;
	public int grade;
	public String addr;
	
	// 생성자.
	public Student() {
		
		serialNum++; // 학생이 생성될 때 마다 증가.
		stuID = serialNum;
	}
	
	public String getStuName() {
		return stuName;
	}
	
	public void setStuName(String name) {
		stuName = name;
	}
}
