package classtest.hashset;

public class Student {
	String stuId;
	String stuName;
	
	public Student(String stuId, String stuName) {
		this.stuId = stuId;
		this.stuName = stuName;
	}

	@Override
	public int hashCode() {
		return Integer.parseInt(stuId);
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student std = (Student)obj;
			if(this.stuId == std.stuId)
				return true;
			else
				return false;
		}
		return false;
	}

	@Override
	public String toString() {
		return stuId + ":" + stuName;
	}


}
