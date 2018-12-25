package classtest.staticex;

public class StudentTest {
	public static void main(String[] args) {
		
		Student hee = new Student();
		hee.setStuName("희딘딘");
		System.out.println(Student.getSerialNum());
		System.out.println(hee.stuName + " 학번 : " + hee.stuID);
		System.out.println("카드번호 : " + hee.cardNum);
		
		System.out.println();
		
		Student rara = new Student();
		rara.setStuName("라라");
		System.out.println(Student.getSerialNum());
		System.out.println(rara.stuName + " 학번 : " + rara.stuID);
		System.out.println("카드번호 : " + rara.cardNum);
	}
}
