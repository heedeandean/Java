package classtest.cooperation;

public class TakeTrans {
	public static void main(String[] args) {
		
		// �л� 3�� ����.
		Student ha = new Student("ha", 5000);
		Student heejin = new Student("heejin", 10000);
		Student rara = new Student("rara", 10000);
		
		
		Bus bus100 = new Bus(100); 				  // 100�� ���� ����
		ha.takeBus(bus100);		   				  // ha�� 100�� ������ Ž
		ha.showInfo(); 			   				  // ha ���� ���
		bus100.showInfo(); 		   				  // ���� ���� ���
		
		System.out.println();
		
		Subway subwayGreen = new Subway("7ȣ��"); // 7ȣ�� ����ö ����
		heejin.takeSubway(subwayGreen);			  // heejin�� 7ȣ�� ����ö Ž
		heejin.showInfo();						  // heejin ���� ���
		subwayGreen.showInfo();					  // ����ö ���� ���
		
		System.out.println();
		
		Taxi taxi1 = new Taxi(1); 		 		 // 1�� �ý� ����
		rara.takeTaxi(taxi1);			  	 	 // rara�� 1�� �ý� Ž
		rara.showInfo();						 // rara ���� ���
		taxi1.showInfo();					 	 // �ý� ���� ���
	}
}
