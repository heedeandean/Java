package test;

public class OverridingTest3 {

	public static void main(String[] args) {
		int price = 10000;
		
		Customer lee = new Customer(10010, "이순신");
		System.out.println(lee.getCusName() + "님이 지불해야 하는 금액은 " + lee.calcPrice(price) + "원 입니다.");
		
		VIPCustomer kim = new VIPCustomer(10020, "김윤미", 12345);
		System.out.println(kim.getCusName() + "님이 지불해야 하는 금액은 " + kim.calcPrice(price) + "원 입니다.");
		
		Customer um = new VIPCustomer(10030, "엄희진", 1004);
		System.out.println(um.getCusName() + "님이 지불해야 하는 금액은 " + um.calcPrice(price) + "원 입니다.");

	}

}
