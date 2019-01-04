package test;

public class BeanCoffee {
	int money;
	
	public String brewing(int money) {
		
		this.money += money;
		if(money == Menu.BAME) {
			return "尼促规 酒皋 备涝";
		}
		else if(money == Menu.BLATTE) {
			return "尼促规 扼都 备涝";
		}
		else {
			return null;
		}
		
	}

}
