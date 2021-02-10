package hello;

import java.util.ArrayList;
import java.util.List;

public class TravleTest {

	public static void main(String[] args) {
		TravelCustomer c1 = new TravelCustomer("일수", 40, 100);
		TravelCustomer c2 = new TravelCustomer("이수", 20, 100);
		TravelCustomer c3 = new TravelCustomer("삼수", 13, 50);
		List<TravelCustomer> cl = new ArrayList<>();
		cl.add(c1);
		cl.add(c2);
		cl.add(c3);
		
		cl.stream().map(c -> c.getName()).forEach(s -> System.out.println(s));
		int total = cl.stream().mapToInt(c->c.getPrice()).sum();
		System.out.println(total);
		
		cl.stream().filter(c->c.getAge()>=20).map(c->c.getName()).sorted().forEach(s->System.out.println(s));
	}

}
