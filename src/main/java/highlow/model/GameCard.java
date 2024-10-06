package highlow.model;

public class GameCard {
	private static Card firstCard;
	private static Card secondCard;
	
	public GameCard(Stock stock) {
		firstCard = stock.pickCard();
		secondCard = stock.pickCard();
	}
	
	public static Card getFirstCard() {
		return firstCard;
	}

	public static Card getSecondCard() {
		return secondCard;
	}
	
	public static String imags(Card card) {
		Suit suit = card.getSuit();
		String suitname = suit.getName();
		int cardnumber =card.getNumber();
		
		if(suitname.equals("スペード")) {
			suitname ="spade";
		}else if(suitname.equals("ハート")){
			suitname ="heart";
		}else if(suitname.equals("ダイヤ")){
			suitname ="diamond";
		}else if(suitname.equals("クラブ")){
			suitname ="club";
		}
		return suitname+cardnumber;
	}

}

