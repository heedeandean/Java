package classtest.staticex;

public class StudentTest {
	public static void main(String[] args) {
		Student hee = new Student();
		hee.setStuName("Èñµòµò");
		System.out.println(hee.serialNum);
		hee.serialNum++;
		
		Student rara = new Student();
		rara.setStuName("¶ó¶ó");
		System.out.println(rara.serialNum);
		rara.serialNum++;
	}
}
