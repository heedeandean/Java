package test;

public class CusTest1 {

	public static void main(String[] args) {
//		Customer lee = new Customer();
//		lee.setCusID(10010);
//		lee.setCusName("¿Ãº¯Ω≈");
//		lee.bonusPoint = 1000;
//		System.out.println(lee.showCusInfo());
		
		VIPCustomer kim = new VIPCustomer(10020, "±Ë¿ØΩ≈", 1);
//		kim.setCusID(10020);
//		kim.setCusName("±Ë¿ØΩ≈");
		kim.bonusPoint = 10000;
		System.out.println(kim.showCusInfo());
	}
}
