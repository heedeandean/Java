package classtest.cooperation2;

public class StarCoffee {
	int money;

	public String brewing(int money) {

		if (money == Menu.STARAMERICANO) {
			this.money += money;
			return "별다방 아메리카노를 구입하였습니다.";
		} else if (money == Menu.STARLATTE) {
			this.money += money;
			return "별다방 라떼를 구입하였습니다.";
		} else {
			return null;
		}
	}

}
