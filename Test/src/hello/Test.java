package hello;

class MyDog {
	String name;
	String type;
	
	public MyDog(String name, String type) {
		this.name = name;
		this.type = type;
	}

	@Override
	public String toString() {
		return type + " " +name;
	}
}
public class Test {

	public static void main(String[] args) {
		MyDog d = new MyDog("멍멍이", "진돗개");
		System.out.println(d);
	}

}
