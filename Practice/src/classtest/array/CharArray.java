package classtest.array;

public class CharArray {

	public static void main(String[] args) {
		
		// 대문자 -> 소문자
		char[] alp = new char[26];
		char ch= 'A';
		
		for(int i=0; i<alp.length; i++, ch++) {
			alp[i] = (char)((int)ch + 32);
			System.out.println(alp[i]);
		}
	}
}
