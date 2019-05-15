package test;

public class CoffeeTest {

	public static void main(String[] args) {
		
		Person kim = new Person("kim", 4000);
		Person lee = new Person("lee", 4500);
		
		StarCoffee sCoffee = new StarCoffee();
		BeanCoffee bCoffee = new BeanCoffee();
		
		kim.buysCoffee(sCoffee, 4000);
		lee.buybCoffee(bCoffee, 4500);
	}

}
