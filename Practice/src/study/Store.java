package study;

public class Store {
	
	public static void main(String[] args) {
		
		int floor = 3;
		String store;
		
		// switch-case
		switch(floor) {
			case 1 : store = "�౹";
					 break;
			case 2 : store = "�����ܰ�";
					 break;
			case 3 : store = "�Ǻΰ�";
			 		 break;
			case 4 : store = "ġ��";
			 		 break;
			case 5 : store = "�ｺ Ŭ��";
			 		 break;
			default: store = "���� ���� �ʴ� ��";
					 break;
		}
		
		System.out.println(floor + "���� " + store + "�Դϴ�.");
	}
}
