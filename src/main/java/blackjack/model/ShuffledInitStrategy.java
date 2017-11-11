package blackjack.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShuffledInitStrategy implements InitStrategy {

	@Override
	public List<Card> createDeck() {
		List<Card> cards = new ArrayList<>();
		createCards(cards, "S");
		createCards(cards, "H");
		createCards(cards, "D");
		createCards(cards, "C");
		Collections.shuffle(cards);
		return cards;
	}

	private void createCards(List<Card> cards, String type) {
		createACard(cards, type);
		createNumCards(cards, type);
		createPictureCards(cards, type);
	}

	private void createNumCards(List<Card> cards, String type) {
		for (int i = 2; i < 10; i++) {
			cards.add(Card.createNum(i, type));
		}
	}

	private void createACard(List<Card> cards, String type) {
		cards.add(Card.createA(type));
	}

	private void createPictureCards(List<Card> cards, String type) {
		cards.add(Card.createJack(type));
		cards.add(Card.createKnight(type));
		cards.add(Card.createQueen(type));
		cards.add(Card.createKing(type));
	}
}
