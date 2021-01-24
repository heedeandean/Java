package hello;

public class Test {

	public static void main(String[] args) {
		char[] a = new char[26];
		char ch = 'A';
		
		for(int i=0; i<a.length; i++, ch++) {
			a[i] = ch;
			System.out.println(a[i] + ", " + (int)a[i]);
		}

	}

}
