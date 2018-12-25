package test;

public class ST1 {

	public static void main(String[] args) {
		Stu hee = new Stu();
		hee.setStuName("엄희진");
		System.out.println(Stu.getSerialNum());
		System.out.println(hee.cardNum);
		
		System.out.println();
		
		Stu jin = new Stu();
		jin.setStuName("류준열");
		System.out.println(Stu.getSerialNum());
		System.out.println(jin.cardNum);
		
		
		
		

	}

}
