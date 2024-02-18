package week06;

/* 
 * Fields
 * 	1.     value (contains a value from 2-14 representing cards 2-Ace)
 * 	2.     name (e.g. Ace of Diamonds, or Two of Hearts)
 * Methods
 * 	1.     Getters and Setters 
 * 	2.     describe (prints out information about a card)
 */

public class Card {
	int value;
	String name;
	
	public int getValue() {
		return this.value;
	}
	
	public void setValue(int cardValue) {
		this.value = cardValue;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String cardName) {
		this.name = cardName;
	}
	
	public void describe() {
		System.out.print(this.name);
	}
	
	public Card (int val, String name) {
		setValue(val);
		setName(name);
	}
}
