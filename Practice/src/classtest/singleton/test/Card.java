package classtest.singleton.test;

public class Card {
	
	private static int serialNum = 0;
	private int cardNum;
	
	public Card() {
		serialNum++;
		cardNum = serialNum;
	}

	public int getCardNum() {
		return cardNum;
	}

	public void setCardNum(int cardNum) {
		this.cardNum = cardNum;
	}
}
