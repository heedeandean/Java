package study;

public class Flow1 {

	public static void main(String[] args) {
		
		// 1���� ������ �� �� ���� 500�� �Ѵ� �ڿ�����?
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
