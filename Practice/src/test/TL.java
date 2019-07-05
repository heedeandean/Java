package test;

interface PrintString {
	void showString(String str);
}

public class TL {

	public static void main(String[] args) {
		PrintString l = s -> System.out.println(s);
		l.showString("하이 람다1");
		showMyString(l);

		PrintString ps = returnString();
		ps.showString("hello ");

	}

	public static void showMyString(PrintString p) {
		p.showString("하이 람다2");
	}

	public static PrintString returnString() {
		return s -> System.out.println(s + "world");
	}

}
