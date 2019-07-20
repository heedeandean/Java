package test;

import java.util.ArrayList;
import java.util.List;

public class CusTest {

	public static void main(String[] args) {
		Cus hee = new Cus("희딘딘", 26, 100);
		Cus shin = new Cus("영신신", 33, 100);
		Cus una = new Cus("유나", 4, 50);

		List<Cus> cusList = new ArrayList<>();
		cusList.add(hee);
		cusList.add(shin);
		cusList.add(una);

		System.out.println("== 고객 명단 추가된 순서대로 출력 ==");
		cusList.stream().map(c -> c.getName()).forEach(s -> System.out.println(s));

		System.out.println();

		int total = cusList.stream().mapToInt(c -> c.getPrice()).sum();
		System.out.println("총 여행 비용은 : " + total + "입니다.");

		System.out.println();

		System.out.println("== 20세 이상 고객 명단 정렬하여 출력 ==");
		cusList.stream().filter(c -> c.getAge() >= 20).map(c -> c.getName()).sorted()
				.forEach(s -> System.out.println(s));

	}

}
