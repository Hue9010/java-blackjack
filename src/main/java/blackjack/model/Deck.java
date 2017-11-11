package blackjack.model;

import java.util.List;

public class Deck {
	List<Card> cards;
	
	public Deck(InitStrategy initStrategy) {
		this.cards = initStrategy.createDeck();
	}
	public Object draw() {
		return cards.remove(0);
	}
}
