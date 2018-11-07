package study;

public class Flow2 {

	public static void main(String[] args) {
		
		// 1부터 100까지 수 중에서 3의 배수만 출력
		int i;
		
		for(i=1; i<=100; i++) {
			if(i % 3 != 0)
				continue;
			
			System.out.println(i);
		}
	}
}
