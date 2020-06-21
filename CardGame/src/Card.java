public class Card {
	
	private Suit suit;
	private Rank rank;
	
	public Card(Suit suit, Rank rank) {
		super();
		this.suit = suit;
		this.rank = rank;
	}
	
	public String getSuit() {
		return suit.printSuit();
	}
	
	
	public int getRank() {
		return rank.getRank();
	}
	
	public int getSuiteValue() {
		return suit.getSuiteValue();
	}
	public String printRank() {
		
		return rank.printRank();
	}

}
