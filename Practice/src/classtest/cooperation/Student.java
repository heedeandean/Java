package classtest.cooperation;

public class Student {
	public String stuName; // �л� �̸�
	public int grade;	   // �г�
	public int money;	   // ���� ��
	
	// ������.
	public Student(String stuName, int money) {
		this.stuName = stuName;
		this.money = money;
	}
	
	// ���� Ÿ�� 1,000���� �����ϴ� �Լ�.
	public void takeBus(Bus bus) {
		bus.take(1000);
		this.money -= 1000;
	}
	
	// ����ö Ÿ�� 1,000���� �����ϴ� �Լ�.
	public void takeSubway(Subway subway) {
		subway.take(1500);
		this.money -= 1500;
	}
	
	// �ý� Ÿ�� 10,000���� �����ϴ� �Լ�.
	public void takeTaxi(Taxi taxi) {
		taxi.take(10000);
		this.money -= 10000;
	}
	
	// �л��� ���� ������ ����ϴ� �Լ�.
	public void showInfo() {
		System.out.println(stuName + "���� ���� ���� " + money + "�� �Դϴ�.");
	}
}
