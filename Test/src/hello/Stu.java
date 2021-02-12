package hello;

public class Stu {
	String stuID;
	String stuName;
	
	public Stu(String stuID, String stuName) {
		this.stuID = stuID;
		this.stuName = stuName;
	}

	@Override
	public String toString() {
		return stuID + ":" + stuName;
	}
	
	
}
