package test;

public class StarCoffee {
	int money;
	
	public String bb(int money) {
		this.money += money;
		
		if(money == Menu.SAM) {
			return "별다방 아메 구입";
		}
		else if(money == Menu.SLATTE) {
			return "별다방 라떼 구입";
		}
		else {
			return null;
		}
		
	}

}
