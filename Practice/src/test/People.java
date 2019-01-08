package test;

public class People {
	String name;
	int money;
	
	People(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	public void buyScoffee(StarCoffee sCoffee, int money) {
		String message = sCoffee.bb(4000);
		
		if(message != null) {
			this.money -= money;
			System.out.println(name + "님이 " + money + "원 으로 " + message);
		}
	}
	
	public void buyBeancoffee(BeanCoffee bCoffee, int money) {
		String message = bCoffee.bb(4500);
		
		if(message != null) {
			this.money -= money;
			System.out.println(name + "님이 " + money + "원 으로 " + message);
		}
	}
	
	
	
}
