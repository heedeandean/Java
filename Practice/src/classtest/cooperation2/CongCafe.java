package classtest.cooperation2;

public class CongCafe {
	String menu;
	int customerCnt;
	int money;
	
	public CongCafe(String menu) {
		this.menu = menu;
	}
	
	public void buy(int money) {
		this.money += money;
		customerCnt++;
	}
	
	public void showInfo() {
		System.out.println("��ٹ��� �湮 ���� " + customerCnt 
							+ "���̰�, " + menu + "�� ������ " + money + "�� �Դϴ�. ");
	}
	
}
