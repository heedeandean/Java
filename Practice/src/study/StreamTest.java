package study;

import java.util.ArrayList;
import java.util.List;

class Book {
	private String name;
	private int price;

	public Book(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}
}

public class StreamTest {

	public static void main(String[] args) {
		List<Book> bookList = new ArrayList<>();

		bookList.add(new Book("자바", 25000));
		bookList.add(new Book("파이썬", 15000));
		bookList.add(new Book("몽고DB", 30000));

		// 스트림 생성하고 출력하기
		System.out.println("== 모든 책의 가격의 합 ==");
		int total = bookList.stream().mapToInt(c -> c.getPrice()).sum();
		System.out.println(total + "원 입니다.");

		System.out.println();

		System.out.println("== 책의 가격이 20,000원 이상인 책의 이름을 정렬하여 출력 ==");
		bookList.stream().filter(c -> c.getPrice() >= 20000).map(c -> c.getName()).sorted()
				.forEach(s -> System.out.println(s));
	}

}
