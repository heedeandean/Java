package classtest.staticex;

public class Student {
	private static int serialNum = 0;
	int stuID;
	String stuName;
	int grade;
	String addr;
	
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

	public static int getSerialNum() {
		return serialNum;
	}

	public static void setSerialNum(int serialNum) {
		Student.serialNum = serialNum;
	}
}
