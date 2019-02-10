package test;

public class Customer {
	private int cusID;
	private String cusName;
	private String cusGrade;
	int bonusPoint;
	double bonusRatio;
	
	public Customer() {
		cusGrade = "SILVER";
		bonusRatio = 0.01;
	}
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price;
	}
	
	public String showCusInfo() {
		return cusName + "���� ����� " + cusGrade + "�̸�, ���ʽ� ����Ʈ�� " + bonusPoint + "�Դϴ�.";
	}
}
