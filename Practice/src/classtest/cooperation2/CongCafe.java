package classtest.cooperation2;

public class CongCafe {
	
	int money;
	
	public String brewing(int money) {
		
		this.money += money;
		
		if(money == Menu.CAme) {
			return "�� �ٹ� �Ƹ޸�ī�븦 �����߽��ϴ�.";
		}
		else if(money == Menu.CLatte) {
			return "�� �ٹ� �󶼸� �����߽��ϴ�.";
		}
		else {
			return null;
		}
	}
		
}
