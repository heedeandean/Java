package hello;

public class Gold extends Customer {
	double saleRatio;
	
	public Gold(int cusID, String cusName) {
		super(cusID, cusName);
		cusGrade = "GOLD";
		bonusRatio = 0.02;
		saleRatio = 0.1;
	}

	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price*saleRatio);
	}
	

}
