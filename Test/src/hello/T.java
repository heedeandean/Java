package hello;
import java.util.ArrayList;;

public class T {
	public static void main(String[] args) {
		
		ArrayList<Customer> cList = new ArrayList<Customer>();
		
		Customer c1 = new Customer(10010, "김일수");
		Customer c2 = new Customer(10020, "김이수");
		Customer c3 = new Gold(10030, "김삼수");
		Customer c4 = new Gold(10040, "김사수");
		Customer c5 = new VIP(10050, "김오수", 12345);
		
		
		cList.add(c1);
		cList.add(c2);
		cList.add(c3);
		cList.add(c4);
		cList.add(c5);
		
		int price = 10000;
		for(Customer c : cList) {
			int cost = c.calcPrice(price);
			System.out.println(c.showCusInfo());
			System.out.println(c.getCusName() + cost + "원 썼다." + c.bonusPoint);
			System.out.println();
		}
	}

}
