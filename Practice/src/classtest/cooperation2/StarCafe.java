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
		System.out.println("별다방의 방문 고객은 " + customerCnt 
							+ "명이고, " + menu + "의 수입은 " + money + "원 입니다. ");
	}
	
}
