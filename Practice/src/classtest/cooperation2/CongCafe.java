package classtest.cooperation2;

public class CongCafe {
	
	int money;
	
	public String brewing(int money) {
		
		this.money += money;
		
		if(money == Menu.CAme) {
			return "콩 다방 아메리카노를 구입했습니다.";
		}
		else if(money == Menu.CLatte) {
			return "콩 다방 라떼를 구입했습니다.";
		}
		else {
			return null;
		}
	}
		
}
