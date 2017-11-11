package blackjack.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class DeckTest {

	@Test
	public void 카드_받기() {
		Deck deck = new Deck(new SortedInitStrategy());
		assertEquals(Card.createA("S"),deck.draw());
		assertEquals(Card.createNum(2,"S"),deck.draw());
		assertEquals(Card.createNum(3,"S"),deck.draw());
		}

}
