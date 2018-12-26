package test;

public class Stu {
	public static int serialNum = 1000;
	public int stuID;
	public String stuName;
	public int grade;
	public String addr;
	
	public Stu() {
		serialNum++;
		stuID = serialNum;
	}
	
	public String getStuName() {
		return stuName;
	}
	
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}


}
