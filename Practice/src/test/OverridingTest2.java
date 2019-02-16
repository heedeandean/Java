package test;

public class OverridingTest2 {

	public static void main(String[] args) {
		Customer um = new VIPCustomer(10030, "희딘딘", 2000);
		um.bonusPoint = 1000;
		
		System.out.println(um.getCusName() + "님이 지불해야 하는 금액은 " + um.calcPrice(10000) + "원 입니다.");

	}

}
