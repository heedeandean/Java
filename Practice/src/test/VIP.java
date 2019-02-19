package test;

public class VIP extends Customer {
	private int agentID;
	double sr;
	
	public VIP(int cusID, String cusName, int agentID) {
		super(cusID, cusName);
		cusGrade = "VIP";
		br = 0.05;
		sr = 0.1;
		this.agentID = agentID;
	}
	
	public int calcPrice(int price) {
		bp += price * br;
		return price - (int)(price * sr);
	}
	
	public String showCusInfo() {
		return super.showCusInfo() + "담당 상담원 번호는 " + agentID + "입니다.";
	}

	public int getAgentID() {
		return agentID;
	}


	
	
	
}
