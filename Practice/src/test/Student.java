package test;

public class Student {
	private static int serialNum = 1000;
	public int stuID;
	public int sutCardID;
	public String stuName;
	public int grade;
	public String address;

	public static int getSerialNum() {
		int i = 10;
		return serialNum;
	}

	public static void setSerialNum(int serialNum) {
		Student.serialNum = serialNum;
	}

	public Student() {
		serialNum++;
		stuID = serialNum;
		sutCardID = stuID + 100;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

}
