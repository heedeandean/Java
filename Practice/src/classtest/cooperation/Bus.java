package classtest.cooperation;

public class Bus {
	int busNum;
	int peopleCount;
	int money;
	
	// ������.
	public Bus(int busNum) {
		this.busNum = busNum;
	}
	
	// �°��� ������ ź ��츦 ������ �Լ�.
	public void take(int money) {
		this.money += money;
		peopleCount++;
	}
	
	//���� ������ ����ϴ� �Լ�.
	public void showInfo() {
		System.out.println("���� " + busNum + "���� �°��� " + peopleCount + 
						   "���̰�, ������ " + money + "�� �Դϴ�.");
	}

}
