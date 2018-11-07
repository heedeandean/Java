package study;

public class Flow1 {

	public static void main(String[] args) {
		
		// 1부터 더했을 때 그 합이 500이 넘는 자연수는?
		int i;
		int sum = 0;
		
		for(i=1; ; i++) {
			
			sum += i;
			
			if(sum > 500)
				break;
		}
		
		System.out.println(i);
		System.out.println(sum);
	}
}
