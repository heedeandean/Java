package test;

public class Card {
	private static int serialNum = 10001;
	private int cardNum;

	public Card() {
		cardNum = serialNum;
		serialNum++;
	}

	public int getCardNum() {
		return cardNum;
	}

}
