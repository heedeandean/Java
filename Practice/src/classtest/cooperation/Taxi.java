package classtest.cooperation;

public class Taxi {
	int taxiNum;
	int peopleCount;
	int money;

	// 생성자.
	public Taxi(int taxiNum) {
		this.taxiNum = taxiNum;
	}

	// 승객이 택시에 탄 경우를 구현한 함수.
	public void take(int money) {
		this.money += money;
		peopleCount++;
	}

	// 택시 정보를 출력하는 함수.
	public void showInfo() {
		System.out.println("택시 " + taxiNum + "의 승객은 " + peopleCount + "명이고, 수입은 " + money + "원 입니다.");
	}
}
