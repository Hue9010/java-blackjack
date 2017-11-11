package blackjack.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class CardTest {

	@Test
	public void A카드_만들어보기() {
		Card card = Card.createA("S");
		assertEquals(1, card.getScore());
		assertEquals("SA", card.getSymbol());
	}

	@Test
	public void 킹_만들기() {
		Card card = Card.createKing("D");
		assertEquals(10, card.getScore());
		assertEquals("DK", card.getSymbol());
	}

	@Test
	public void 퀸_만들기() {
		Card card = Card.createQueen("H");
		assertEquals(10, card.getScore());
		assertEquals("HQ", card.getSymbol());
	}

	@Test
	public void 잭_만들기() {
		Card card = Card.createJack("S");
		assertEquals(10, card.getScore());
		assertEquals("SJ", card.getSymbol());
	}

	@Test
	public void 나이트_만들기() {
		Card card = Card.createKnight("C");
		assertEquals(10, card.getScore());
		assertEquals("CC", card.getSymbol());
	}

	@Test
	public void 숫자_카드_만들기() {
		Card card = Card.createNum(4, "C");
		assertEquals(4, card.getScore());
		assertEquals("C4", card.getSymbol());
	}
}
