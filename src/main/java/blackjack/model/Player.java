package blackjack.model;

import java.util.ArrayList;
import java.util.List;

public class Player {
	private List<Card> cards;
	private int score;
	
	public Player(Card firstCard, Card secondCard) {
		cards = new ArrayList<>();
		cards.add(firstCard);
		cards.add(secondCard);
		score = firstCard.getScore() + secondCard.getScore();
	}

	public int cardVolume() {
		return cards.size();
	}

	public boolean addCard(Card card) {
		score += card.getScore();
		cards.add(card);
		return isEnd();
	}
	
	private boolean isEnd() {
		return score < 22;
	}

	public String getLastCard() {
		return cards.get(cards.size() - 1).getSymbol();
	}

	public int getScore() {
		return score;
	}

}
