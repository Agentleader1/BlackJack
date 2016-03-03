//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -  

package BlackJack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import static com.alex.apcs.utils.UtilPrint.*;

public class Deck {
	public static final int NUMFACES = 13;
	public static final int NUMSUITS = 4;
	public static final int NUMCARDS = 52;

	public static final String SUITS[] = { "CLUBS", "SPADES", "DIAMONDS", "HEARTS" };

	private int topCardIndex;
	private ArrayList<Card> stackOfCards;

	public Deck() {
		// initialize data
		stackOfCards = new ArrayList<>();
		topCardIndex = NUMCARDS - 1;

		// populate stackOfCards with new cards
		for (int i = 0; i < NUMSUITS; i++)
			for (int a = 0; a < NUMFACES; a++) {
				BlackJackCard bjc = new BlackJackCard();
				bjc.setFace(a);
				bjc.setSuit(SUITS[i]);
				stackOfCards.add(bjc);
			}
		
		// out.println(stackOfCards);
		printLine(stackOfCards);
	}

	// modifiers
	public void shuffle() {
		long seed = System.nanoTime();
		Collections.shuffle(stackOfCards, new Random(seed));
		Collections.shuffle(stackOfCards, new Random(seed));
	}

	// accessors
	public int size() {
		return stackOfCards.size();
	}

	public int numCardsLeft() {
		return topCardIndex + 1;
	}

	public Card nextCard() {
		return stackOfCards.get(topCardIndex--);
	}

	@Override
	public String toString() {
		return stackOfCards + "   topCardIndex = " + topCardIndex;
	}
}
