package classtest.array;

public class ObjectCopy1 {

	public static void main(String[] args) {
		Student[] stuArray1 = new Student[3];
		Student[] stuArray2 = new Student[3];
		
		stuArray1[0] = new Student(1, "Um");
		stuArray1[1] = new Student(2, "Hee");
		stuArray1[2] = new Student(3, "Jin");
		
		System.arraycopy(stuArray1, 0, stuArray2, 0, 3);

		for(int i=0; i<stuArray2.length; i++) {
			stuArray2[i].showStudentInfo();
		}
	}

}
