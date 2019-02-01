package classtest.arraylist;

public class StudentTest {

	public static void main(String[] args) {
		
		Student lee = new Student(1001, "Lee");
		lee.addSub("국어", 100);
		lee.addSub("수학", 50);
		
		Student kim = new Student(1002, "kim");
		kim.addSub("국어", 70);
		kim.addSub("수학", 85);
		kim.addSub("영어", 100);
		
		lee.showStuInfo();
		System.out.println("=================================");
		kim.showStuInfo();
	}
}
