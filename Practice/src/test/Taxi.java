package test;

public class Taxi {
	int taxiNum;
	int stuCnt;
	int money;
	
	public Taxi(int taxiNum) {
		this.taxiNum = taxiNum;
	}
	
	public void take(int money) {
		this.money += money;
		stuCnt++;
	}
	
	public void showInfo() {
		System.out.println("�ý� " + taxiNum + "���� �°��� " + stuCnt + "���̰�, ������ " + money + "�Դϴ�.");
	}


}
