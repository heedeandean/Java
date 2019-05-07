package classtest.cooperation2;

public class Customer {
	
	String cusName;
	int money;
	
	public Customer(String cusName, int money) {
		this.cusName = cusName;
		this.money = money;
	}
	
	public void buyStarCafe(StarCafe sCafe, int money) {
		String message = sCafe.brewing(4000);
		if(message != null) {
			this.money -= money;
			System.out.println(cusName + "님이 " + money + "원 으로 " + message);
		}
	}
	
	public void buyCongCafe(CongCafe cCafe, int money) {
		String message = cCafe.brewing(4500);
		if(message != null) {
			this.money -= money;
			System.out.println(cusName + "님이 " + money + "원 으로 " + message);
		}
	}
	
}
