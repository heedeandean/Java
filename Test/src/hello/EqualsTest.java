package hello;

class Stu {
	int stuId;
	String stuName;
	
	public Stu(int stuId, String stuName) {
		this.stuId = stuId;
		this.stuName = stuName;
	}

	@Override
	public String toString() {
		return stuId + "," + stuName;
	}
	
	
}

public class EqualsTest {

	public static void main(String[] args) {
		Stu s1 = new Stu(100, "김일수");
		Stu s2 = s1;
		Stu s3 = new Stu(100, "김일수");
		
		if(s1 == s2) System.out.println("s1, s2 주소 같음");
		else System.out.println("s1, s2 주소 다름");
		
		if(s1.equals(s2)) System.out.println("s1, s2 동일");
		else System.out.println("s1, s2 동일하지 않음");
		
		if(s1 == s3) System.out.println("s1, s3 주소 같음");
		else System.out.println("s1, s3 주소 다름");
		
		if(s1.equals(s3)) System.out.println("s1, s3 동일");
		else System.out.println("s1, s3 동일하지 않음");
		
	}

}
