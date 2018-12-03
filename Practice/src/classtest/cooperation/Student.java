package classtest.cooperation;

public class Student {
	public String stuName; // 학생 이름
	public int grade;	   // 학년
	public int money;	   // 가진 돈
	
	// 생성자.
	public Student(String stuName, int money) {
		this.stuName = stuName;
		this.money = money;
	}
	
	// 버스 타면 1,000원을 지불하는 함수.
	public void takeBus(Bus bus) {
		bus.take(1000);
		this.money -= 1000;
	}
	
	// 지하철 타면 1,000원을 지불하는 함수.
	public void takeSubway(Subway subway) {
		subway.take(1500);
		this.money -= 1500;
	}
	
	// 택시 타면 10,000원을 지불하는 함수.
	public void takeTaxi(Taxi taxi) {
		taxi.take(10000);
		this.money -= 10000;
	}
	
	// 학생의 현재 정보를 출력하는 함수.
	public void showInfo() {
		System.out.println(stuName + "님의 남은 돈은 " + money + "원 입니다.");
	}
}
