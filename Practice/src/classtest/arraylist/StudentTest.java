package classtest.arraylist;

public class StudentTest {

	public static void main(String[] args) {
		
		Student lee = new Student(1001, "Lee");
		lee.addSub("����", 100);
		lee.addSub("����", 50);
		
		Student kim = new Student(1002, "kim");
		kim.addSub("����", 70);
		kim.addSub("����", 85);
		kim.addSub("����", 100);
		
		lee.showStuInfo();
		System.out.println("=================================");
		kim.showStuInfo();
	}
}
