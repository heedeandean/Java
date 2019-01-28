package classtest.array;

import java.util.ArrayList;

public class StudentArrayList {

	public static void main(String[] args) {
		
		ArrayList<Student> school = new ArrayList<Student>();
		
		school.add(new Student(1001, "Um"));
		school.add(new Student(1002, "Hee"));
		school.add(new Student(1003, "Jin"));
		
		for(int i=0; i<school.size(); i++) {
//			Student student = school.get(i);
//			student.showStudentInfo();
//			
			school.get(i).showStudentInfo();
		}
		
		System.out.println("=================");
		
		for(Student student : school) {
			student.showStudentInfo();
		}
	}
}
