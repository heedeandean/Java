package classtest.staticex;

public class StudentTest {
	public static void main(String[] args) {
		Student hee = new Student();
		hee.setStuName("����");
		System.out.println(hee.serialNum);
		hee.serialNum++;
		
		Student rara = new Student();
		rara.setStuName("���");
		System.out.println(rara.serialNum);
		rara.serialNum++;
	}
}
