//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

package BlackJack;

public class Dealer extends AbstractPlayer {
	private Deck deckOfCards;

	// constructors
	public Dealer() {
		deckOfCards = new Deck();
	}
	
	// shuffle
	public void shuffle() {
		deckOfCards.shuffle();
	}
	
	// deal Card method
	public Card deal() {
		return deckOfCards.nextCard();
	}
	
	@Override
	public boolean hit() {
		addCardToHand(new BlackJackCard());
		return getHandValue() > 21;
	}

	public int numCardsLeftInDeck() {
		return deckOfCards.size();
	}
}