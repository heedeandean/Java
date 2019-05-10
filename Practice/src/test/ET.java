package test;

class Student {
	int stuID;
	String stuName;
	
	Student(int stuID, String stuName) {
		this.stuID = stuID;
		this.stuName = stuName;
	}

	@Override
	public String toString() {
		return stuName + ", " + stuID;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student stu = (Student)obj;
			if(this.stuID == stu.stuID)
				return true;
			else return false;
		}
		return false;
	}

	@Override
	public int hashCode() {
		return stuID;
	}
}

public class ET {

	public static void main(String[] args) {
		Student hee1 = new Student(1, "heedean");
		Student hee2 = hee1;
		Student jin = new Student(1, "heedean");
		
		if(hee1 == hee2)
			System.out.println("hee1, hee2의 주소는 같습니다.");
		else
			System.out.println("hee1, hee2의 주소는 다릅니다.");
		
		if(hee1.equals(hee2))
			System.out.println("hee1, hee2의 주소는 같습니다.");
		else
			System.out.println("hee1, hee2의 주소는 다릅니다.");
		
		if(hee1 == jin)
			System.out.println("hee1, jin의 주소는 같습니다.");
		else
			System.out.println("hee1, jin의 주소는 다릅니다.");
		
		if(hee1.equals(jin))
			System.out.println("hee1, jin의 주소는 같습니다.");
		else
			System.out.println("hee1, jin의 주소는 다릅니다.");
		
		System.out.println("hee1의 hashCode : " + hee1.hashCode());
		System.out.println("jin의 hashCode : " + jin.hashCode());
		
		System.out.println("hee1의 실제 주소 값 : " + System.identityHashCode(hee1));
		System.out.println("jin의 실제 주소 값 : " + System.identityHashCode(jin));
		
	}
}
