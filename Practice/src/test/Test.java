package test;

public class Test {

	public static void main(String[] args) {
		char[] alp = new char[26];
		char ch = 'A';
		
		for(int i=0; i<alp.length; i++, ch++) {
			alp[i] = ch;
			System.out.println((char)((int)alp[i]+32));
		}

	}

}
