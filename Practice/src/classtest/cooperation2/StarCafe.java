package classtest.cooperation2;

public class StarCafe {
	String menu;
	int customerCnt;
	int money;
	
	public StarCafe(String menu) {
		this.menu = menu;
	}
	
	public void buy(int money) {
		this.money += money;
		customerCnt++;
	}
	
	public void showInfo() {
		System.out.println("���ٹ��� �湮 ���� " + customerCnt 
							+ "���̰�, " + menu + "�� ������ " + money + "�� �Դϴ�. ");
	}
	
}
