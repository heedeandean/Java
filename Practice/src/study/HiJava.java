package study;

public class HiJava {
	public static void main(String[] args) {
		char o = '/';
		float n1 = 10;
		float n2 = 4;
		float result;
		
		switch (o) {
		 case '+' : result = n1 + n2;
		 	break;
		 case '-' : result = n1 - n2;
		 	break;
		 case '*' : result = n1 * n2;
		 	break;
		 case '/' : result = n1 / n2;
		 	break;
		 default:
			 System.out.println("�ùٸ� ��Ģ������ �ƴմϴ�.");
			 return;
		}
		
		System.out.println("����� " + result + "�Դϴ�.");

		test
	}
}
