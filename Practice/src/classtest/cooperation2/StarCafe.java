package classtest.cooperation2;

public class StarCafe {

	int money;
	
	public String brewing(int money) {
		
		this.money += money;
		
		if(money == Menu.SAme) {
			return "별 다방 아메리카노를 구입했습니다.";
		}
		else if(money == Menu.SLatte) {
			return "별 다방 라떼를 구입했습니다.";
		}
		else {
			return null;
		}
	}
		
}
