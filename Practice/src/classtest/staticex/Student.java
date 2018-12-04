package classtest.staticex;

public class Student {
	public static int serialNum = 1;
	public int stuID;
	public String stuName;
	public int grade;
	public String addr;
	
	public String getStuName() {
		return stuName;
	}
	
	public void setStuName(String name) {
		stuName = name;
	}
}
