package classtest.cooperation;

public class Taxi {
	int taxiNum;
	int peopleCount;
	int money;
	
	// ������.
	public Taxi(int taxiNum) {
		this.taxiNum = taxiNum;
	}
	
	// �°��� �ýÿ� ź ��츦 ������ �Լ�.
	public void take(int money) {
		this.money += money;
		peopleCount++;
	}
	
	// �ý� ������ ����ϴ� �Լ�.
	public void showInfo() {
		System.out.println("�ý� " + taxiNum + "�� �°��� " + peopleCount + 
						   "���̰�, ������ " + money + "�� �Դϴ�.");
	}
}
