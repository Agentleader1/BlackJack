package BlackJack;
//© A+ Computer Science  -  www.apluscompsci.com

import java.awt.Graphics;

import javax.swing.JPanel;

public class DeckTestTwo extends JPanel {
	private static final long serialVersionUID = 695319295678185623L;
	public static final int NUMCARDS = 52;

	public DeckTestTwo() {
		setVisible(true);
	}

	@Override
	public void paintComponent(Graphics window) {
		super.paintComponent(window);

		Deck deck = new Deck();

		for (int i = 0; i < NUMCARDS; i++) {
			Card c = deck.nextCard();
			c.setWidth(90);
			c.setHeight(120);
			c.drawCard(window, i * 11 + 25, 50 + i * 4);
		}

		deck.shuffle();

		for (int i = 0; i < NUMCARDS; i++) {
			Card c = deck.nextCard();
			c.setWidth(90);
			c.setHeight(120);
			c.drawCard(window, i * 11 + 25, 250 + i * 4);
		}
	}
}