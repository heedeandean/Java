package test;

public class CoffeeTest {

	public static void main(String[] args) {
		People kim = new People("kim", 4000);
		People lee = new People("lee", 4500);
		
		StarCoffee sCoffee = new StarCoffee();
		BeanCoffee bCoffee = new BeanCoffee();
		
		kim.buyScoffee(sCoffee, 4000);
		lee.buyBeancoffee(bCoffee, 4500);
	}

}
