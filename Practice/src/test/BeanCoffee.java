package test;

public class BeanCoffee {
	int money;
	
	public String bb(int money) {
		this.money += money;
		
		if(money == Menu.BAM) {
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
