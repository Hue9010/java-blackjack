package blackjack.model;

public class Card {
	private int score;
	private String symbol;

	private Card(int score, String symbol) {
		this.score = score;
		this.symbol = symbol;
	}

	public static Card createNum(int num, String type) {
		return new Card(num, type + Integer.toString(num));
	}

	public static Card createA(String type) {
		return new Card(1, type + "A");
	}

	public static Card createKing(String type) {
		return new Card(10, type + "K");
	}

	public static Card createQueen(String type) {
		return new Card(10, type + "Q");
	}

	public static Card createJack(String type) {
		return new Card(10, type + "J");
	}

	public static Card createKnight(String type) {
		return new Card(10, type + "C");
	}

	public int getScore() {
		return score;
	}

	public String getSymbol() {
		return symbol;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + score;
		result = prime * result + ((symbol == null) ? 0 : symbol.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Card other = (Card) obj;
		if (score != other.score)
			return false;
		if (symbol == null) {
			if (other.symbol != null)
				return false;
		} else if (!symbol.equals(other.symbol))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Card [score=" + score + ", symbol=" + symbol + "]";
	}
	
}
