package classtest.array;

public class CharArray {

	public static void main(String[] args) {
		
		// �빮�� -> �ҹ��� 
		char[] alp = new char[26];
		char ch= 'A';
		
		for(int i=0; i<alp.length; i++, ch++) {
			alp[i] = (char)((int)ch + 32);
			System.out.println(alp[i]);
		}
	}
}
