package test;

public class OverridingTest2 {

	public static void main(String[] args) {
		Customer um = new VIPCustomer(10030, "����", 2000);
		um.bonusPoint = 1000;
		
		System.out.println(um.getCusName() + "���� �����ؾ� �ϴ� �ݾ��� " + um.calcPrice(10000) + "�� �Դϴ�.");

	}

}
