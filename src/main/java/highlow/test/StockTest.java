package highlow.test;

import org.junit.jupiter.api.Test;

import highlow.model.Card;
import highlow.model.Stock;

class StockTest {

	@Test
	void testStock() {
		Stock stock = new Stock();
		while (stock.getNumberOfCards() > 0) {
			Card card = stock.pickCard();
			System.out.println(card);
		}
	}

}
