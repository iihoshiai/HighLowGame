package highlow.test;

import org.junit.jupiter.api.Test;

import highlow.model.Card;
import highlow.model.GameCard;
import highlow.model.Stock;

class GameCardTest {

	@Test
	void test() {
		Stock stock = new Stock();
		new GameCard(stock);
		Card firstCard =GameCard.getFirstCard();
		Card secondCard =GameCard.getSecondCard();
			System.out.println(firstCard);
			System.out.println(secondCard);
		
	}

}
