//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date - 
//Class -
//Lab  -

package BlackJack;

public class BlackJackCard extends Card {
	// constructors
	public BlackJackCard() {
		super();
	}
	
	public BlackJackCard(int value, String suit) {
		super(value, suit);
	}
	
	public BlackJackCard(int value, String suit, int width, int height) {
		super(value, suit, width, height);
	}
	
	public int getValue() {
		// enables you to build the value for the game into the card
		// this makes writing the whole program a little easier
		if (getFace() == 1)
			return 11;
		else if (getFace() >= 10)
			return 10;
		return 0;
	}
}