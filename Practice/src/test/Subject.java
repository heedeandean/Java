package test;

import java.util.ArrayList;

public class Subject {
	private String subName;
	private int subId;
	private int gradeType;

	private ArrayList<Student> stuList = new ArrayList<Student>();

	public Subject(String subName, int subId) {
		this.subName = subName;
		this.subId = subId;
		this.gradeType = Define.AB_TYPE;
	}

	public String getSubName() {
		return subName;
	}

	public void setSubName(String subName) {
		this.subName = subName;
	}

	public int getSubId() {
		return subId;
	}

	public void setSubId(int subId) {
		this.subId = subId;
	}

	public int getGradeType() {
		return gradeType;
	}

	public void setGradeType(int gradeType) {
		this.gradeType = gradeType;
	}

	public ArrayList<Student> getStuList() {
		return stuList;
	}

	public void setStuList(ArrayList<Student> stuList) {
		this.stuList = stuList;
	}

	public void register(Student stu) {
		stuList.add(stu);
	}
}
