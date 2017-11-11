package blackjack.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class PlayerTest {

	@Test
	public void 플레이어_생성() {
		Player player = new Player(Card.createA("S"), Card.createNum(7, "C"));
		assertEquals(2, player.cardVolume());
		assertEquals(8, player.getScore());
	}

	@Test
	public void 추가_카드_받기() {
		Player player = new Player(Card.createA("S"), Card.createA("D"));
		player.addCard(Card.createA("D"));
		assertEquals(Card.createA("D").getSymbol(), player.getLastCard());
		assertEquals(3, player.cardVolume());
	}

	@Test
	public void 현재_점수_계산() {
		Player player = new Player(Card.createNum(9, "C"), Card.createQueen("D"));
		assertFalse(player.addCard(Card.createJack("S")));
	}
}
