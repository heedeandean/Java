package test;

public class CT {

	public static void main(String[] args) {
		Customer customer = new Customer();
		
		Buy buyer = customer;
		buyer.buy();
		buyer.order();
		
		Sell seller = customer;
		seller.sell();
		seller.order();
		
		if(seller instanceof Customer) {
			Customer cus2 = (Customer)seller;
			cus2.buy();
			cus2.sell();
		}
		
		customer.order();
	}
}
