package study;

public class ForEx {

	public static void main(String[] args) {
		
//		다이아몬드 만들기
		int lineCnt = 9;
		int spaceCnt = lineCnt-1;
		int starCnt = 1;
		
		for(int i=1; i<=lineCnt; i++) {
			
			for (int j=1; j<=spaceCnt; j++) {
				System.out.print(' ');
			}
			
			for(int j=1; j<=starCnt; j++) {
				System.out.print("*");
			}
			
			System.out.println();
			
			if(i < ((lineCnt/2) + 1)) {
				spaceCnt -= 1;
				starCnt += 2;				
			}
			else {
				spaceCnt += 1;
				starCnt -= 2;						
			}
		}
	}
}