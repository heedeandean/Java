package hello;

interface PrintString {
	void showString(String str);
}

public class TestLambda {

	public static void main(String[] args) {
		PrintString l = s -> System.out.println(s);
		l.showString("aaaaaaaa");
		showMyString(l);
		
		PrintString r = returnString();
		r.showString("22222222222222 ");
	}
	public static void showMyString(PrintString p) {
		p.showString("bbbbbbbbb");
	}
	
	public static PrintString returnString() {
		return s -> System.out.println(s + "44444444444444444444");
	}
}
