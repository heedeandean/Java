package classtest.array;

public class DeepCopy {

	public static void main(String[] args) {
		Student[] stuArray1 = new Student[3];
		Student[] stuArray2 = new Student[3];

		stuArray1[0] = new Student(1, "Um");
		stuArray1[1] = new Student(2, "Hee");
		stuArray1[2] = new Student(3, "Jin");

		stuArray2[0] = new Student();
		stuArray2[1] = new Student();
		stuArray2[2] = new Student();

		for (int i = 0; i < stuArray1.length; i++) {
			stuArray2[i].setStuID(stuArray1[i].getStuID());
			stuArray2[i].setName(stuArray1[i].getName());
		}

		for (int i = 0; i < stuArray2.length; i++) {
			stuArray2[i].showStudentInfo();
		}

		stuArray1[0].setStuID(100);
		stuArray1[0].setName("rara");

		System.out.println("=== stuArray1 ===");
		for (int i = 0; i < stuArray1.length; i++) {
			stuArray1[i].showStudentInfo();
		}

		System.out.println("=== stuArray2 ===");
		for (int i = 0; i < stuArray2.length; i++) {
			stuArray2[i].showStudentInfo();
		}
	}

}
