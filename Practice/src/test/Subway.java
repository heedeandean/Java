package test;

public class Subway {
	String lineNo;
	int cusCount;
	int money;

	public Subway(String lineNo) {
		this.lineNo = lineNo;
	}

	public void take(int money) {
		this.money += money;
		cusCount++;
	}

	public void showInfo() {
		System.out.println("지하철 " + lineNo + "의 승객은 " + cusCount + "명이고, 수입은 " + money + "입니다.");
	}
}
