package classtest.singleton.test;

public class CardCompanyTest {

	public static void main(String[] args) {
		CardCompany company = CardCompany.getInstance();
		
		Card one = company.createCard();
		Card two = company.createCard();
		
		System.out.println(one.getCardNum());
		System.out.println(two.getCardNum());

	}

}
