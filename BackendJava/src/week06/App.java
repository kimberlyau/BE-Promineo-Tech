package week06;

/*
 * Create a class called App with a main method.
 * 	a. Instantiate a Deck and two Players, call the shuffle method on the deck.
 * 	b. Using a traditional for loop, iterate 52 times calling the Draw method on the other player each iteration using the 
 * 			Deck you instantiated.
 * 	c.  Using a traditional for loop, iterate 26 times and call the flip method for each player.
 * 			Compare the value of each card returned by the two player’s flip methods. 
 * 			Call the incrementScore method on the player whose card has the higher value.  
 * 			Print a message to say which player received a point.
 * 			Note:  If the values are equal (it is a tie), print a message saying that no point was awarded.
 * 	d.  After the loop, compare the final score from each player.
 * 	e.      Print the final score of each player and either “Player 1”, “Player 2”, or “Draw” depending on which score is higher or if they are both the same.
 *  
 *  Tips:  Printing out information throughout the game adds value including easier debugging as you progress and a better user experience.
 *  a.  Using the Card describe() method when each card is flipped illustrates the game play.
 *  b.  Printing the winner of each turn adds interest -- or a message indicating a tie.
 *  c.  Printing the updated score after each turn shows game progression.
 *  d.  At the end of the game: print the final score of each player and the winner’s name or “Draw” if the result is a tie.
 */

public class App {
	public static void main(String[] args) {
		int deckSize = 52; 
		
		// Instantiate Deck and two players
		Deck deck = new Deck();
		deck.shuffle();
		Player player1 = new Player("Player 1");
		Player player2 = new Player("Player 2");
		
		// Drawing all cards for each player
		for (int i = 0; i < deckSize; i++) {
			if (i % 2 == 0) {
				player1.draw(deck);
			} else {
				player2.draw(deck);
			}
		}
		
		System.out.println("Playing war!");
		System.out.println("");
		
		for (int j = 0; j < deckSize / 2; j++) {
			int p1Card = player1.flip().value;
			int p2Card = player2.flip().value;
			
			if (p1Card == p2Card) {
				System.out.println("This round was a tie, no points were added");
			} else if (p1Card > p2Card) {
				System.out.println("*** Player 1 won this round ***");
				player1.incrementScore();
			} else {
				System.out.println("*** Player 2 won this round ***");
				player2.incrementScore();
			}
			
			System.out.println("Current progress: ");
			player1.describe();
			player2.describe();
			
			System.out.println("");
			
		}
		
		System.out.println("");
		System.out.println("The game is over!");

		// Result of game
		if (player1.getScore() == player2.getScore()) {
			System.out.println("***** This game was a draw *****");
		} else if (player1.getScore() > player2.getScore()) {
			System.out.println("***** Player 1 is the winner!! *****");
			System.out.println("Final scores " + player1.getScore() + " : " + player2.getScore());
		} else {
			System.out.println("***** Player 2 is the winner!! *****");
			System.out.println("Final scores " + player2.getScore() + " : " + player1.getScore());
		}
	}
}
