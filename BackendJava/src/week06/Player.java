package week06;

import java.util.*;

/* 
 * Fields
 * 	1.     hand (List of Card)
 * 	2.     score (set to 0 in the constructor)
 * 	3.     name
 * Methods
 * 	1.     describe (prints out information about the player and calls the describe method for each card in the Hand List)
 * 	2.     flip (removes and returns the top card of the Hand)
 * 	3.     draw (takes a Deck as an argument and calls the draw method on the deck, adding the returned Card to the hand field)
 * 	4.     incrementScore (adds 1 to the Player’s score field)
 */

public class Player {
	List<Card> hand = new ArrayList<>();
	int score;
	String name;
	
	public void describe() {
		System.out.print(name + "'s score: " + this.score + " | ");
		System.out.print(name + "'s hand has " + hand.size() + " card(s) left: ");
		for (int i = 0; i < hand.size(); i++) {
			if (i == hand.size() - 1) {
				hand.get(i).describe();	
				System.out.println(" ");
			} else  {
				hand.get(i).describe();	
				System.out.print(", ");
			}
			
		}
	}
	
	public Card flip() {
		Card flippedCard = hand.get(0);
		hand.remove(0);
		return flippedCard;
	}
	
	public void draw(Deck d) {
		hand.add(d.draw());
	}
	
	public void incrementScore() {
		this.score += 1;
	}
	
	public int getScore() {
		return this.score;
	}
	
	public Player(String playerName) {
		// Initialize name and score
		this.name = playerName;
		this.score = 0;
	}
}
