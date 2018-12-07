package classtest.staticex;

public class Student {
	public static int serialNum = 0;
	public int stuID;
	public String stuName;
	public int grade;
	public String addr;
	
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
}
