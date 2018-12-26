package test;

public class ST1 {

	public static void main(String[] args) {
		Stu hee = new Stu();
		hee.setStuName("엄희진");
		System.out.println(hee.serialNum);
		System.out.println(hee.stuID);
		System.out.println(Stu.serialNum);
		
		System.out.println();
		
		Stu jin = new Stu();
		jin.setStuName("류준열");
		System.out.println(jin.serialNum);
		System.out.println(jin.stuID);
		System.out.println(Stu.serialNum);
		
		
		

	}

}
