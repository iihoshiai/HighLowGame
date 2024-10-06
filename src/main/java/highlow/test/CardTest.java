package highlow.test;

import java.util.List;

import org.junit.jupiter.api.Test;

import highlow.model.Card;

class CardTest {

	@Test
	void test() {
		List<Card> cards = Card.getAllCards();
		for (Card card : cards) {
			System.out.println(card);
		}
	}

}
