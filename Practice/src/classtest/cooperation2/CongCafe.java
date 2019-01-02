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
		System.out.println("콩다방의 방문 고객은 " + customerCnt 
							+ "명이고, " + menu + "의 수입은 " + money + "원 입니다. ");
	}
	
}
