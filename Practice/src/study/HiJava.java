package study;

public class HiJava {
	public static void main(String[] args) {
		int age = 60;
		int charge;
		
		if(age < 8) {
			charge = 1000;
			System.out.println("취학 전 아동입니다.");
		}
		else if(age < 14) {
			charge = 2000;
			System.out.println("초딩");
		}
		else if(age < 20) {
			charge = 2500;
			System.out.println("중, 고딩");
		}
		else if(age < 60){
			charge = 3000;
			System.out.println("성인");
		}
		else {
			charge = 0;
			System.out.println("노인");
		}
		
		System.out.println("입장료는 " + charge + "원입니다.");
		
	}
}
