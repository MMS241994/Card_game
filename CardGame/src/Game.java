import java.util.ArrayList;
import java.util.Scanner;

public class Game {
	
	public static void main(String args[]) {
		
		
		Hand h1, h2, h3; //Number of players
		
		
		//Creating players
		h1=new Hand();
		h2=new Hand();
		h3=new Hand();
		
		Deck d1 = new Deck();
		System.out.println("All the Cards");
		d1.populate(); 
		System.out.println("---------------------------------------------");
		System.out.println("Cards after shuffling");
		ArrayList<Card> c = d1.shuffle();
		System.out.println("---------------------------------------------");
		System.out.println("The game has started");
		
		h1.card = c.get(0); //picking the cards
		h2.card = c.get(1);
		h3.card = c.get(2);
		
		System.out.println(h1.card + "" + h2.card+ ""+h3.card); //printing the cards
		
		//winners
		if((h1.card.getRank() > h2.card.getRank()) && (h1.card.getRank() > h3.card.getRank())){ 
			System.out.print("Player 1 is the winner");
		}else if((h2.card.getRank() > h3.card.getRank()) && (h2.card.getRank() > h1.card.getRank())) {
				System.out.print("Player 2 is the winner");
		}else if((h3.card.getRank()>h2.card.getRank()) && (h3.card.getRank() > h1.card.getRank())) {
				System.out.print("Player 3 is the winner");
		}else if ((h1.card.getSuiteValue() > h2.card.getSuiteValue()) && (h1.card.getSuiteValue() > h3.card.getSuiteValue())) {
			System.out.print("Player 1 is the winner");
		}else if ((h2.card.getSuiteValue() > h1.card.getSuiteValue()) && (h2.card.getSuiteValue() > h3.card.getSuiteValue())) {
			System.out.print("Player 2 is the winner");
		}else if((h3.card.getSuiteValue() > h1.card.getSuiteValue()) && (h3.card.getSuiteValue() > h2.card.getSuiteValue())) {
			System.out.print("Player 3 is the winner");
		}
	}	
}