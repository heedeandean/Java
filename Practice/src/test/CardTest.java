package test;

public class CardTest {

	public static void main(String[] args) {
		CardCompany factory = CardCompany.getInstance(); // 싱글톤 패턴

		Card c1 = factory.createCard();
		Card c2 = factory.createCard();

		System.out.println(c1.getCardNum());
		System.out.println(c2.getCardNum());
	}

}
