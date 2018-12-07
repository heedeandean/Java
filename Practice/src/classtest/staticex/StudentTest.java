package classtest.staticex;

public class StudentTest {
	public static void main(String[] args) {
		
		Student hee = new Student();
		hee.setStuName("Èñµòµò");
		System.out.println(Student.serialNum);
		System.out.println(hee.stuName + " ÇÐ¹ø : " + hee.stuID);
		
		
		Student rara = new Student();
		rara.setStuName("¶ó¶ó");
		System.out.println(Student.serialNum);
		System.out.println(rara.stuName + " ÇÐ¹ø : " + rara.stuID);
	}
}
