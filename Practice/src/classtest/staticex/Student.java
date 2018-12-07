package classtest.staticex;

public class Student {
	private static int serialNum = 0;
	int stuID;
	String stuName;
	int grade;
	String addr;
	
	// ������.
	public Student() {
		
		serialNum++; // �л��� ������ �� ���� ����.
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
