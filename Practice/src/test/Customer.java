package test;

public class Customer {
	protected int cusID;
	protected String cusName;
	protected String cusGrade;
	int bonusPoint;
	double bonusRatio;
	
	public int getCusID() {
		return cusID;
	}

	public void setCusID(int cusID) {
		this.cusID = cusID;
	}

	public String getCusName() {
		return cusName;
	}

	public void setCusName(String cusName) {
		this.cusName = cusName;
	}

	public String getCusGrade() {
		return cusGrade;
	}

	public void setCusGrade(String cusGrade) {
		this.cusGrade = cusGrade;
	}

//	public Customer() {
//		cusGrade = "SILVER";
//		bonusRatio = 0.01;
//		System.out.println("Customer() ������ ȣ��");
//	}
//	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price;
	}
	
	public String showCusInfo() {
		return cusName + "���� ����� " + cusGrade + "�̸�, ���ʽ� ����Ʈ�� " + bonusPoint + "�Դϴ�.";
	}
	
	public Customer(int cusID, String cusName) {
		this.cusID = cusID;
		this.cusName = cusName;
		cusGrade = "SILVER";
		bonusRatio = 0.01;
		System.out.println("Customer(int cusID, String cusName) ������ ȣ��");
	}
}
