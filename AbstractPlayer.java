//© A+ Computer Science  -  www.apluscompsci.com
//Name - 
//Date -
//Class -
//Lab  -

package BlackJack;

import java.awt.Graphics;
import java.util.ArrayList;

public abstract class AbstractPlayer implements Playerable {
	private ArrayList<Card> hand;
	private int winCount;

	public AbstractPlayer() {
		hand = new ArrayList<>();
	}

	public AbstractPlayer(int score) {
		this();
		winCount = score;
	}

	@Override
	public void addCardToHand(Card temp) {
		hand.add(temp);
	}

	@Override
	public void resetHand() {
		hand.clear();
	}

	@Override
	public void setWinCount(int numwins) {
		winCount = numwins;
	}

	@Override
	public int getWinCount() {
		return winCount;
	}

	@Override
	public int getHandSize() {
		return hand.size();
	}

	public ArrayList<Card> getHand() {
		return hand;
	}

	@Override
	public int getHandValue() {
		int sum = 0;
		for (Card c : hand)
			sum += c.getValue();
		return sum;
	}

	@Override
	public String toString() {
		return "hand = " + hand.toString() + " \n-  # wins " + winCount;
	}

	public void drawHand(Graphics window, int x, int y) {

	}
}