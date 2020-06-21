import java.util.ArrayList;
import java.util.Random;

public class Deck extends Hand{
	
	Random rand = new Random();
	
	public void populate() {
		
		for(Suit suit: Suit.values()) {
			for(Rank rank: Rank.values()) {
				Card card = new Card(suit,rank);
				this.add(card);
				System.out.print(card);
			}
		}	
	}
	
	public ArrayList<Card> shuffle() {
		for(int i=cards.size() - 1; i>0 ; i--) {
		
			int pick = rand.nextInt(i);
			Card randCard = cards.get(pick);
			Card lastCard = cards.get(i);
			cards.set(i,randCard);
			cards.set(pick, lastCard);
		}
		System.out.print(cards);
		return cards;
	}	
	
	
}
