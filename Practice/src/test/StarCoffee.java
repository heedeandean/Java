package test;

public class StarCoffee {
	
	int money;
	
	public String bb(int money) {
		this.money += money;
		
		if(money == Menu.SAME) {
			return "���ٹ� �Ƹ� ����";
		}
		else if(money == Menu.SLATTE) {
			return "���ٹ� �� ����";
		}
		else {
			return null;
		}
		
		
	}

}