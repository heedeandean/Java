package classtest;

public class Person2Test {

	public static void main(String[] args) {
		
		// Person2클래스에 디폴트 생성자 있어야 함.
		Person2 jin = new Person2();
		jin.name = "진진";
		jin.height = 180.0F;
		jin.weight = 85.5F;
		
		// 매개변수가 있는 생성자 추가. 
		// (매개변수가 있기 때문에 Person2클래스에 디폴트 생성자 없어도 됨.)
		Person2 hee = new Person2("희진", 163, 52);
	}

}
