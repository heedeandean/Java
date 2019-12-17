package classtest.cooperation2;

public class CoffeeTest {
	public static void main(String[] args) {
		Person p = new Person("ㅎ", 10000);

		StarCoffee sCoffee = new StarCoffee();
		p.buyStarCoffee(sCoffee, 4000);
	}

}
