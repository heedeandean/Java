package study;

public class Shape {

	public static void main(String[] args) {
		int lineCount = 7;
		int startCount = 1;
		int spaceCount = (lineCount / 2) + 2;
		
		for(int i=1; i<=lineCount; i++) {
			for(int j=1; j<=spaceCount; j++) {
				System.out.print(' ');	
			}
			for(int j=1; j<=startCount; j++) {
				System.out.print('*');
			}
			System.out.println();
		
			if(i <= (lineCount/2)) {
				spaceCount -= 1;
				startCount += 2;			
			} 
			else {
				spaceCount += 1;
				startCount -= 2;
			}	
		}
	}
}
