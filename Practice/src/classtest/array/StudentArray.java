package classtest.array;

public class StudentArray {

	public static void main(String[] args) {
		
		Student[] stu = new Student[3];
		
		stu[0] = new Student(1001, "Um");
		stu[1] = new Student(1002, "Hee");
		stu[2] = new Student(1003, "Jin");
		
		for(int i=0; i<stu.length; i++) {
			stu[i].showStudentInfo();
		}
	}
}
