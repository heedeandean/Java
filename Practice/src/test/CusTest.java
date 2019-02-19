package test;

public class CusTest {

	public static void main(String[] args) {
		Customer lee = new Customer();
		lee.setCusID(10010);
		lee.setCusName("�̼���");
		lee.bp = 1000;
		
		System.out.println(lee.showCusInfo());
		
		Customer kim = new VIP(10020, "������", 12345);
		kim.bp = 1000;
		
		System.out.println(kim.showCusInfo());
		
		System.out.println("========");
		
		int price = 10000;
		int leePrice = lee.calcPrice(price);
		int kimPrice = kim.calcPrice(price);
		
		System.out.println(lee.getCusName() + "���� " + leePrice + "�� �����ϼ̽��ϴ�.");
		System.out.println(lee.showCusInfo());
		
		System.out.println();
		
		System.out.println(kim.getCusName() + "���� " + kimPrice + "�� �����ϼ̽��ϴ�.");
		System.out.println(kim.showCusInfo());
		

	}

}
