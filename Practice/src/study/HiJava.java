package study;

public class HiJava {
	public static void main(String[] args) {
		int lineCount = 4;
		int starCount = 1;
		int spaceCount = lineCount/2 + 3;
		

		for (int i=1; i<=lineCount; i++) {
			
			for (int j=1; j<=spaceCount; j++) {
				System.out.print(" ");
			}
			
			for (int j=1; j<=starCount; j++) {
				System.out.print("*");
			}

			spaceCount -= 1;
			starCount += 2;
			System.out.println();
		}
			
		
	
	}
}
