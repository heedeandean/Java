package classtest.staticex;

public class StudentTest {
	public static void main(String[] args) {
		
		Student hee = new Student();
		hee.setStuName("����");
		System.out.println(Student.getSerialNum());
		System.out.println(hee.stuName + " �й� : " + hee.stuID);
		System.out.println("ī���ȣ : " + hee.cardNum);
		
		System.out.println();
		
		Student rara = new Student();
		rara.setStuName("���");
		System.out.println(Student.getSerialNum());
		System.out.println(rara.stuName + " �й� : " + rara.stuID);
		System.out.println("ī���ȣ : " + rara.cardNum);
	}
}
