import java.util.ArrayList;

public class Hand {
	
	public ArrayList<Card> cards;
	public Card card;
	
	public Hand() {
		cards= new ArrayList<Card>();
	}
	
	public void clear() {
		cards.clear();
	}
	
	public void add(Card card) {
		cards.add(card);
	}
	

}
