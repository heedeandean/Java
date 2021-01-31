package hello;

public class VIP extends Customer {
	private int agentID;
	double saleRatio;
	
	public VIP(int cusID, String cusName, int agentID) {
		super(cusID, cusName);
		cusGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentID = agentID;
	}

	public int getAgentID() {
		return agentID;
	}
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price*saleRatio);
	}
	
	public String showCusInfo() {
		return super.showCusInfo() + agentID;
	}
	
	


	
}
