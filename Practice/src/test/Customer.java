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
//		System.out.println("Customer() 생성자 호출");
//	}
//	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price;
	}
	
	public String showCusInfo() {
		return cusName + "님의 등급은 " + cusGrade + "이며, 보너스 포인트는 " + bonusPoint + "입니다.";
	}
	
	public Customer(int cusID, String cusName) {
		this.cusID = cusID;
		this.cusName = cusName;
		cusGrade = "SILVER";
		bonusRatio = 0.01;
		System.out.println("Customer(int cusID, String cusName) 생성자 호출");
	}
}
