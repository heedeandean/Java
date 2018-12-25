package test;

public class Subway {
	
	String subNum;
	int stuCnt;
	int money;
	
	public Subway(String subNum) {
		this.subNum = subNum;
	}
	
	public void take(int money) {
		this.money += money;
		stuCnt++;
	}
	
	public void showInfo() {
		System.out.println("지하철 " + subNum + "의 승객은 " + stuCnt + "명이고, 수입은 " + money + "입니다.");
	}

}
