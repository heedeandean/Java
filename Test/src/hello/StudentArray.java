package hello;

public class StudentArray {

	public static void main(String[] args) {
		Student[] s = new Student[3];
		
		s[0] = new Student("1001", "김일수");
		s[1] = new Student("1002", "김이수");
		s[2] = new Student("1003", "김삼수");

		for(int i=0; i<s.length; i++) {
			s[i].showStudentInfo();
		}
		

		
		
	}

}
