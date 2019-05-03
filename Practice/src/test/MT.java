package test;

public class MT {

	public static void main(String[] args) {
		MyClass mc = new MyClass();
		
		X x = mc;
		x.x();
	
		Y y = mc;
		y.y();
		
		MyInterface mi = mc;
		mi.myMethod();
		mi.x();
		mi.y();
	}

}
