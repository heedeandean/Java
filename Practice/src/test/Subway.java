package test;

public class Subway {
	
	String subNum;
	int stuCnt;
	int money;
	
	public Subway(String subNum) {
		this.subNum = subNum;
	}
	
	public void take(int money) {
		this.money += money;
		stuCnt++;
	}
	
	public void showInfo() {
		System.out.println("����ö " + subNum + "�� �°��� " + stuCnt + "���̰�, ������ " + money + "�Դϴ�.");
	}

}
