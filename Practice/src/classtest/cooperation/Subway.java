package classtest.cooperation;

public class Subway {
	String lineNum;
	int peopleCount;
	int money;
	
	// ������.
	public Subway(String lineNum) {
		this.lineNum = lineNum;
	}
	
	// �°��� ����ö�� ź ��츦 ������ �Լ�.
	public void take(int money) {
		this.money += money;
		peopleCount++;
	}
	
	// ����ö ������ ����ϴ� �Լ�.
	public void showInfo() {
		System.out.println("����ö " + lineNum + "�� �°��� " + peopleCount + 
						   "���̰�, ������ " + money + "�� �Դϴ�.");
	}

}
