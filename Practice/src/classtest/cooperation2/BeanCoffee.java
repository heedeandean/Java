package classtest.cooperation2;

public class BeanCoffee {
	int money;
	
	public String brewing(int money) {
		if(money == Menu.BEANAMERICANO) {
			this.money += money;
			return "콩 다방 아메리카노";
		}
		else if(money == Menu.BEANLATTE) {
			this.money += money;
			return "콩 다방 라떼";
		}
		else {
			return null;
		}
	}
}