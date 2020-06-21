
public enum Rank {
	ACE(14,"Ace"), TWO(2, "Two"), THREE(3,"Three"), FOUR(4,"Four"),
	FIVE(5,"Five"), SIX(6,"Six"), SEVEV(7,"Seven"), EIGHT(8,"Eight"),
	NINE(9,"Nine"), TEN(10,"Ten"), JACK(11,"Jack"), QUEEN(12,"Queen"),
	KING(13,"King");
	
	private final int rankValue;
	private final String stringValue;
	
	private Rank(int rankValue,String stringValue) {
		this.rankValue=rankValue;
		this.stringValue=stringValue;
	}
	
	public int getRank() {
		return  rankValue;
	}
	
	public String printRank() {
		return stringValue;
	}
	
	

}
