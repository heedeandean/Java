package study;

public class Shape {

	public static void main(String[] args) {
		
		// ���̾Ƹ�� ��� ����ϱ� �ڵ�.
		int shape = 1; 
		int line = 50;
		int space = (line / 2) + 3; 
		
		// ������ line��ŭ ���.
		for(int k=1; k<=(line+1); k++) {
			
			// ���� ' '���.
			for(int j=1; j<space; j++) {
				System.out.print(' '); 
			}
			
			// '*' ���.
			for(int i=1; i<=shape; i++) {
				System.out.print('*'); 
			}
			
			// ������ line�� ������ ������ ���̾Ƹ�� ������� ����ϰ� ��.
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
