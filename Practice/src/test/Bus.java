package test;

public class Bus {
	int busNo;
	int cusCount;
	int money;

	public Bus(int busNo) {
		this.busNo = busNo;
	}

	public void take(int money) {
		this.money += money;
		cusCount++;
	}

	public void showInfo() {
		System.out.println("버스 " + busNo + "번의 승객은 " + cusCount + "명이고, 수입은 " + money + "입니다.");
	}
}
