//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

package BlackJack;

import java.awt.Component;

import javax.swing.JFrame;

public class CardDeckPlayerGraphicsRunner extends JFrame {
	private static final long serialVersionUID = 1818418110025134939L;
	private static final int WIDTH = 800;
	private static final int HEIGHT = 600;

	public CardDeckPlayerGraphicsRunner() {
		super("BLACKJACK CardDeckPlayerRunner");
		setSize(WIDTH, HEIGHT);

		// test the Card class
		CardTestTwo cardTest = new CardTestTwo();
		getContentPane().add(cardTest);

		
		// test the Deck class
		 DeckTestTwo deckTest = new DeckTestTwo();
		 ((Component)deckTest).setFocusable(true);
		 getContentPane().add(deckTest);

		// test the Player class
		// PlayerTestTwo playerTest = new PlayerTestTwo();
		// ((Component)playerTest).setFocusable(true);
		// getContentPane().add(playerTest);

		setVisible(true);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String args[]) {
		new CardDeckPlayerGraphicsRunner();
	}
}