package classtest.array;

public class StudentArray {

	public static void main(String[] args) {

		Student[] stu = new Student[3];

		stu[0] = new Student(1001, "김일수");
		stu[1] = new Student(1002, "김이수");
		stu[2] = new Student(1003, "김삼수");

		for (int i = 0; i < stu.length; i++) {
			stu[i].showStudentInfo();
		}
	}
}
