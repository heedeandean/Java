package test;

public class Stu {
	String stuId;
	String stuName;

	public Stu(String stuId, String stuName) {
		this.stuId = stuId;
		this.stuName = stuName;
	}

	@Override
	public int hashCode() {
		return Integer.parseInt(stuId);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Stu) {
			Stu s = (Stu) obj;
			if (this.stuId == s.stuId)
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
