package test;

public class Gold extends Customer {
	double sr;
	
	public Gold(int cusID, String cusName) {
		super(cusID, cusName);
		cusGrade = "GOLD";
		br = 0.02;
		sr = 0.1;
	}

	public int calcPrice(int price) {
		bp += price * br;
		return price - (int)(price * sr);
	}
}
