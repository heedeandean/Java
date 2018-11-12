package study;

public class Shape {

	public static void main(String[] args) {
		
		// 다이아몬드 모양 출력하기 코딩.
		int shape = 1; 
		int line = 50;
		int space = (line / 2) + 3; 
		
		// 지정한 line만큼 출력.
		for(int k=1; k<=(line+1); k++) {
			
			// 공백 ' '출력.
			for(int j=1; j<space; j++) {
				System.out.print(' '); 
			}
			
			// '*' 출력.
			for(int i=1; i<=shape; i++) {
				System.out.print('*'); 
			}
			
			// 지정한 line을 반으로 나누어 다이아몬드 모양으로 출력하게 함.
			if(k > (line / 2)) {
				space += 1;
				shape -= 2;
			}
			else {
				space -= 1;
				shape += 2;
			}
			System.out.println();
		}
	}
}
