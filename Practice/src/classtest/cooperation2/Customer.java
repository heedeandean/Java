package classtest.cooperation2;

public class Customer {
	public String cusName;
	public int money;
	
	public Customer(String cusName, int money) {
		this.cusName = cusName;
		this.money = money;
	}
	
	public void buyStarCafe(StarCafe starCafe) {
		starCafe.buy(4000);
		this.money -= 4000;
	}
	
	public void buyCongCafe(CongCafe congCafe) {
		congCafe.buy(4500);
		this.money -= 4500;
	}
	
	public void showInfo() {
		System.out.println(cusName + "´ÔÀÇ ³²Àº µ·Àº " + money + "¿ø ÀÔ´Ï´Ù.");
	}
}
