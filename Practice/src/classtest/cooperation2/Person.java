package classtest.cooperation2;

public class Person {
	String name;
	int money;

	public Person(String name, int money) {
		this.name = name;
		this.money = money;
	}

	public void buyStarCoffee(StarCoffee sCoffee, int money) {
		String message = sCoffee.brewing(money);
		if (message != null) {
			this.money -= money;
			System.out.println(name + "이 " + money + "으로 " + message);
		}
	}
}
