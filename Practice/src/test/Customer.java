package test;

public class Customer {
	protected int cusID;
	protected String cusName;
	protected String cusGrade;
	int bp;
	double br;
	
	public Customer() {
		initCus();
	}
	
	public Customer(int cusID, String cusName) {
		this.cusID = cusID;
		this.cusName = cusName;
		initCus();
	}
	
	private void initCus() {
		cusGrade = "실버";
		br = 0.01;
	}
	
	public int calcPrice(int price) {
		bp += price * br;
		return price;
	}
	
	public String showCusInfo() {
		return cusName + "님의 등급은 " + cusGrade + "이며, 보너스 포인트는 " + bp + "입니다.";
	}

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
	
	
}
