package test;

public class HiJava {

	public static void main(String[] args) {
		char[] alp = new char[26];
		char ch = 'A';
		
		for(int i=0; i< alp.length; i++, ch++) {
			alp[i] = ch; 
		}
		
		for(int i=0; i< alp.length; i++) {
			System.out.println(alp[i]+", " + (int)alp[i]);
		}
		


	}

}
