package study;

public class HiJava {
	int studentID;
	String studentName;
	int grade;
	String address;
	
	public String getStudentName() {
		return studentName;
	}

	public static void main(String[] args) {
		HiJava su = new HiJava();
		su.studentName = "¾öÈñÁø";
		    
		System.out.println(su.studentName);
		System.out.println(su.getStudentName());
				
				
	
	}
}
