package week06;

import java.util.*;

/*
 * Fields
 * 	1.     cards (List of Card)
 * Methods
 * 	1.     shuffle (randomizes the order of the cards)
 * 	2.     draw (removes and returns the top card of the Cards field)
 * 	3.     In the constructor, when a new Deck is instantiated, the Cards field should be populated with the standard 52 cards.
 */

public class Deck {
	List<Card> cards = new ArrayList<>();
	
	public void shuffle() {
		Collections.shuffle(cards);
	}
	
	public Card draw() {
		Card drawnCard = cards.get(0);
		cards.remove(0);
		
		return drawnCard;
	}
	
	public Deck() { 
		// Values: from 2-14 representing cards 2-Ace
		int startingNum = 2;
		int lastNum = 14; 
		
		for (int i = startingNum; i <= lastNum; i++) {
			String valueString = "";
			
			// 11 Jack
			if (i == 11) {
				valueString += "Jack of ";
			}
			// 12 Queen
			else if (i == 12) {
				valueString += "Queen of ";
			}
			// 13 King
			else if (i == 13) {
				valueString += "King of ";
			}
			// 14 Ace
			else if (i == 14) {
				valueString += "Ace of ";
			}
			else {
				valueString += i + " of ";
			}
			
			// Add Spades
			cards.add(new Card(i, valueString + "Spades"));
			
			// Add Hearts
			cards.add(new Card(i, valueString + "Hearts"));
			
			// Add Clubs
			cards.add(new Card(i, valueString + "Clubs"));
			
			// Add Diamonds
			cards.add(new Card(i, valueString + "Diamonds"));
			
			
		}
	}
}
