package classtest.cooperation2;

public class StarCafe {

	int money;
	
	public String brewing(int money) {
		
		this.money += money;
		
		if(money == Menu.SAme) {
			return "�� �ٹ� �Ƹ޸�ī�븦 �����߽��ϴ�.";
		}
		else if(money == Menu.SLatte) {
			return "�� �ٹ� �󶼸� �����߽��ϴ�.";
		}
		else {
			return null;
		}
	}
		
}
