package test;
import java.util.ArrayList;

public class CusArrayList {

	public static void main(String[] args) {
		ArrayList<Customer> cusList = new ArrayList<Customer>();
		
		Customer lee = new Customer(1, "�̼���");
		Customer um = new VIP(2, "������", 1004);
		Customer kim = new Customer(3, "��̰�");
		Customer hong = new Gold(4, "ȫ��ǥ");
		Customer ma = new Gold(5, "������");
		
		cusList.add(lee);
		cusList.add(um);
		cusList.add(kim);
		cusList.add(hong);
		cusList.add(ma);
		
		System.out.println("======�� ���� ���=========");
		for(Customer cus : cusList) {
			System.out.println(cus.showCusInfo());
		}
		
		System.out.println();
		
		System.out.println("=========�������� ���ʽ� ����Ʈ ���");
		int price = 10000;
		for(Customer cus : cusList) {
			int cost = cus.calcPrice(price);
			System.out.println(cus.getCusName() + "���� " + cost + "�� �����ϼ̽��ϴ�.");
			System.out.println(cus.getCusName() + "���� ���� ���ʽ� ����Ʈ�� " + cus.bp + "���Դϴ�.");
			System.out.println();
		}
	}
}
