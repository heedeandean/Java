package classtest.array;

import java.util.ArrayList;

public class StudentArrayList {

	public static void main(String[] args) {

		ArrayList<Student> stuList = new ArrayList<Student>();

		stuList.add(new Student(1001, "김일수"));
		stuList.add(new Student(1002, "김이수"));
		stuList.add(new Student(1003, "김삼수"));

		for (int i = 0; i < stuList.size(); i++) {
			stuList.get(i).showStudentInfo();
		}

		System.out.println("=================");

		for (Student stu : stuList) {
			stu.showStudentInfo();
		}
	}
}
