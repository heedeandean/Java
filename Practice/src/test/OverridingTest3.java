package test;

public class OverridingTest3 {

	public static void main(String[] args) {
		int price = 10000;
		
		Customer lee = new Customer(10010, "�̼���");
		System.out.println(lee.getCusName() + "���� �����ؾ� �ϴ� �ݾ��� " + lee.calcPrice(price) + "�� �Դϴ�.");
		
		VIPCustomer kim = new VIPCustomer(10020, "������", 12345);
		System.out.println(kim.getCusName() + "���� �����ؾ� �ϴ� �ݾ��� " + kim.calcPrice(price) + "�� �Դϴ�.");
		
		Customer um = new VIPCustomer(10030, "������", 1004);
		System.out.println(um.getCusName() + "���� �����ؾ� �ϴ� �ݾ��� " + um.calcPrice(price) + "�� �Դϴ�.");

	}

}
