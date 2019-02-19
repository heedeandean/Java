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
		return super.showCusInfo() + "��� ���� ��ȣ�� " + agentID + "�Դϴ�.";
	}

	public int getAgentID() {
		return agentID;
	}


	
	
	
}
