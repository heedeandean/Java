package classtest.staticex;

public class StudentTest {
	public static void main(String[] args) {
		
		Student hee = new Student();
		hee.setStuName("����");
		System.out.println(Student.serialNum);
		System.out.println(hee.stuName + " �й� : " + hee.stuID);
		
		
		Student rara = new Student();
		rara.setStuName("���");
		System.out.println(Student.serialNum);
		System.out.println(rara.stuName + " �й� : " + rara.stuID);
	}
}
