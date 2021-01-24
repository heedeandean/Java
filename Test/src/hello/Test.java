package hello;

public class Test {

	public static void main(String[] args) {
		Student s1 = new Student(1001, "일수");
		s1.addSub("국어", 100);
		s1.addSub("수학", 50);

		Student s2 = new Student(1002, "이수");
		s2.addSub("국어", 70);
		s2.addSub("수학", 85);
		s2.addSub("영어", 100);
		
		s1.showStuInfo();
		System.out.println();
		s2.showStuInfo();
		
		
	}

}
