package test;

public class VIPCustomer extends Customer {
	private int agentID;
	double saleRatio;
	
//	public VIPCustomer() {
//		cusGrade = "VIP";
//		bonusRatio = 0.05;
//		saleRatio = 0.1;
//		System.out.println("VIPCustomer() 생성자 호출");
//	}
//	
	public VIPCustomer(int cusID, String cusName, int agentID) {
		super(cusID, cusName);
		cusGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentID = agentID;
		System.out.println("VIPCustomer(int cusID, String cusName, int agentID) 생성자 호출");
	}

	public int getAgentID() {
		return agentID;
	}
	
}
