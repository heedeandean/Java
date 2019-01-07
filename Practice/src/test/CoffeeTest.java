package test;

public class CoffeeTest {

	public static void main(String[] args) {
		Person kim = new Person("kim", 5000);
		Person lee = new Person("lee", 5000);
		
		StarCoffee sCoffee = new StarCoffee();
		BeanCoffee bCoffee = new BeanCoffee();
		
		kim.buyStarCoffee(sCoffee, 4000);
		lee.buyBeanCoffee(bCoffee, 4500);

	}

}
