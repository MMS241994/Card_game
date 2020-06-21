
public enum Suit {
	SPADES(1,"Spades"),
	HEARTS(2,"Hearts"),
	CLUBS(3,"Clubs"),
	DIAMONDS(4,"Diamonds");
	
	private final String suitText;
	private final int suitValue;

	private Suit( int suitValue, String suitText) {
		this.suitText = suitText;
		this.suitValue = suitValue;
	}
	
	public String printSuit() {
		return suitText;
	}
	
	public int getSuiteValue() {
		return  suitValue;
	}
    
}
