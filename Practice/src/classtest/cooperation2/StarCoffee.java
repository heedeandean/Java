package classtest.cooperation2;

public class StarCoffee {
	int money;
	
	public String brewing(int money) {
		if(money == Menu.STARAMERICANO) {
			this.money += money;
			return "별 다방 아메리카노";
		}
		else if(money == Menu.STARLATTE) {
			this.money += money;
			return "별 다방 라떼";
		}
		else {
			return null;
		}
	}
}