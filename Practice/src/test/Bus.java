package test;

public class Bus {
	int busNum;
	int stuCnt;
	int money;
	
	public Bus(int busNum) {
		this.busNum = busNum;
	}
	
	public void take(int money) {
		this.money += money;
		stuCnt++;
	}
	
	public void showInfo() {
		System.out.println("���� " + busNum + "���� �°��� " + stuCnt + "���̰�, ������ " + money + "�Դϴ�.");
	}


}
