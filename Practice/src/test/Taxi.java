package test;

public class Taxi {
	int taxiNum;
	int stuCnt;
	int money;
	
	public Taxi(int taxiNum) {
		this.taxiNum = taxiNum;
	}
	
	public void take(int money) {
		this.money += money;
		stuCnt++;
	}
	
	public void showInfo() {
		System.out.println("택시 " + taxiNum + "번의 승객은 " + stuCnt + "명이고, 수입은 " + money + "입니다.");
	}


}
