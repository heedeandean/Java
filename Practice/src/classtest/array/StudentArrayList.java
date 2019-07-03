package classtest.array;

import java.util.ArrayList;

public class StudentArrayList {

	public static void main(String[] args) {

		ArrayList<Student> stuList = new ArrayList<Student>();

		stuList.add(new Student(1001, "Um"));
		stuList.add(new Student(1002, "Hee"));
		stuList.add(new Student(1003, "Jin"));

		for (int i = 0; i < stuList.size(); i++) {
//			Student student = school.get(i);
//			student.showStudentInfo();
//			
			stuList.get(i).showStudentInfo();
		}

		System.out.println("=================");

		for (Student stu : stuList) {
			stu.showStudentInfo();
		}
	}
}
