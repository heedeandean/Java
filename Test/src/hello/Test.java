package hello;

public class Test {

	public static void main(String[] args) {
		char[][] arr = new char[13][2];
		char ch = 'a';
//		for(int i=0; i<arr.length; i++) {
//			for(int j=0; j<arr[i].length; j++) {
//				System.out.println(arr[i][j]);
//			}
//			System.out.println();
//		}
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++, ch++) {
				arr[i][j] = ch;
				System.out.println(arr[i][j]);
			}
			System.out.println();
		}
		
		
		
	}

}
