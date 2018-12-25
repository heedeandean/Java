package test;

public class Stu {
	private static int serialNum = 1000;
	public int stuID;
	public String stuName;
	public int grade;
	public String addr;
	public int cardNum;
	
	public Stu() {
		serialNum++;
		stuID = serialNum;
		cardNum = stuID + 100;
	}
	
	public String getStuName() {
		return stuName;
	}
	
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public static int getSerialNum() {
		return serialNum;
	}

	public static void setSerialNum(int serialNum) {
		Stu.serialNum = serialNum;
	}


}
