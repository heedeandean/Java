package test;

import java.util.ArrayList;

public class School {
	private static School instance = new School();

	private static String SCHOOL_NAME = "HEEDEANDEAN School";
	private ArrayList<Student> stuList = new ArrayList<Student>();
	private ArrayList<Subject> subList = new ArrayList<Subject>();

	private School() {}

	public static School getInstance() {
		if (instance == null)
			instance = new School();
		return instance;
	}

	public ArrayList<Student> getStuList() {
		return stuList;
	}

	public void addStudent(Student stu) {
		stuList.add(stu);
	}

	public void addSubject(Subject sub) {
		subList.add(sub);
	}

	public ArrayList<Subject> getSubList() {
		return subList;
	}

	public void setSubList(ArrayList<Subject> subList) {
		this.subList = subList;
	}
}
