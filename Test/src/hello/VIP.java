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
		System.out.println("하위클래스 생성");
	}

	public int getAgentID() {
		return agentID;
	}
	
	
}
