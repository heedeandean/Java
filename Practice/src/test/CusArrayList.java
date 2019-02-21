package test;
import java.util.ArrayList;

public class CusArrayList {

	public static void main(String[] args) {
		ArrayList<Customer> cusList = new ArrayList<Customer>();
		
		Customer lee = new Customer(1, "이순신");
		Customer um = new VIP(2, "엄희진", 1004);
		Customer kim = new Customer(3, "김미경");
		Customer hong = new Gold(4, "홍명표");
		Customer ma = new Gold(5, "마진영");
		
		cusList.add(lee);
		cusList.add(um);
		cusList.add(kim);
		cusList.add(hong);
		cusList.add(ma);
		
		System.out.println("======고객 정보 출력=========");
		for(Customer cus : cusList) {
			System.out.println(cus.showCusInfo());
		}
		
		System.out.println();
		
		System.out.println("=========할인율과 보너스 포인트 계산");
		int price = 10000;
		for(Customer cus : cusList) {
			int cost = cus.calcPrice(price);
			System.out.println(cus.getCusName() + "님이 " + cost + "원 지불하셨습니다.");
			System.out.println(cus.getCusName() + "님의 현재 보너스 포인트는 " + cus.bp + "점입니다.");
			System.out.println();
		}
	}
}
