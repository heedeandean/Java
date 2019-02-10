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
		return cusName + "님의 등급은 " + cusGrade + "이며, 보너스 포인트는 " + bonusPoint + "입니다.";
	}
}
