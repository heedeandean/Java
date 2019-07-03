package classtest.cooperation;

public class Subway {
	String lineNum;
	int peopleCount;
	int money;

	// 생성자.
	public Subway(String lineNum) {
		this.lineNum = lineNum;
	}

	// 승객이 지하철에 탄 경우를 구현한 함수.
	public void take(int money) {
		this.money += money;
		peopleCount++;
	}

	// 지하철 정보를 출력하는 함수.
	public void showInfo() {
		System.out.println("지하철 " + lineNum + "의 승객은 " + peopleCount + "명이고, 수입은 " + money + "원 입니다.");
	}

}
