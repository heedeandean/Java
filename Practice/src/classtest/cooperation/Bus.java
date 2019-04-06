package classtest.cooperation;

public class Bus {
	int busNum;
	int peopleCount;
	int money;
	
	// 생성자.
	public Bus(int busNum) {
		this.busNum = busNum;
	}
	
	// 승객이 버스에 탄 경우를 구현한 함수.
	public void take(int money) {
		this.money += money;
		peopleCount++;
	}
	
	//버스 정보를 출력하는 함수.
	public void showInfo() {
		System.out.println("버스 " + busNum + "번의 승객은 " + peopleCount + 
				   "명이고, 수입은 " + money + "원 입니다.");
	}

}
