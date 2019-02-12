package test;

public class VIPCustomer extends Customer {
	private int agentID;
	double saleRatio;
	
	public VIPCustomer() {
		cusGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
	}

	public int getAgentID() {
		return agentID;
	}
	
}
