package test;

public class Taxi {
	int TaxiNo;
	int cusCount;
	int money;

	public Taxi(int TaxiNo) {
		this.TaxiNo = TaxiNo;
	}

	public void take(int money) {
		this.money += money;
		cusCount++;
	}

	public void showInfo() {
		System.out.println("택시 " + TaxiNo + "번의 승객은 " + cusCount + "명이고, 수입은 " + money + "입니다.");
	}
}
