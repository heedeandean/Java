package classtest.cooperation2;

public class CoffeeTest {
	public static void main(String[] args) {
		Person p = new Person("김일수", 10000);
		StarCoffee sCoffee = new StarCoffee();
		BeanCoffee bCoffee = new BeanCoffee();
		
		p.buyStarCoffee(sCoffee, 4000);
		p.buyBeanCoffee(bCoffee, 4500);
	}
}