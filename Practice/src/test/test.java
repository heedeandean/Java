package test;

public class Test {

	public static void main(String[] args) {
		char[][] alp = new char[13][2];
		char ch = 'a';
		
		for(int i=0; i<alp.length; i++) {
			for(int j=0; j<alp[i].length; j++) {
				alp[i][j] = ch;
				ch++;
				System.out.println(alp[i][j]);
			}
			System.out.println();
		}
		
		
		

	}

}
