package test;

public class CusTest1 {

	public static void main(String[] args) {
//		Customer lee = new Customer();
//		lee.setCusID(10010);
//		lee.setCusName("�̼���");
//		lee.bonusPoint = 1000;
//		System.out.println(lee.showCusInfo());
		
		VIPCustomer kim = new VIPCustomer();
		kim.setCusID(10020);
		kim.setCusName("������");
		kim.bonusPoint = 10000;
		System.out.println(kim.showCusInfo());
	}
}
