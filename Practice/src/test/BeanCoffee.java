package test;

public class BeanCoffee {
	int money;
	
	public String brewing(int money) {
		
		this.money += money;
		if(money == Menu.BAME) {
			return "��ٹ� �Ƹ� ����";
		}
		else if(money == Menu.BLATTE) {
			return "��ٹ� �� ����";
		}
		else {
			return null;
		}
		
	}

}
