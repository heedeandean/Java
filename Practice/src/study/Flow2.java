package study;

public class Flow2 {

	public static void main(String[] args) {
		
		// 1���� 100���� �� �߿��� 3�� ����� ���
		int i;
		
		for(i=1; i<=100; i++) {
			if(i % 3 != 0)
				continue;
			
			System.out.println(i);
		}
	}
}
