package hello;

public class HelloJava {

	public static void main(String[] args) {
		
		int l;
		int loopCnt = 1;
		int layerCnt = 7;
		int space;
		int spaceCnt = layerCnt-1;
		
		for(int layer=1; layer<=layerCnt; layer++) {
			
			for (space=1; space<=spaceCnt; space++) {
				System.out.print(' ');
			}
			
			for(l=1; l<=loopCnt; l++) {
				System.out.print("*");
			}
			System.out.println();
			
			if(layer < ((layerCnt/2) + 1)) {
				spaceCnt -= 1;
				loopCnt += 2;				
			}
			else {
				spaceCnt += 1;
				loopCnt -= 2;						
			}
			
			
			
		}
			
		
	}

}
