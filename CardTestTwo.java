package BlackJack;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;

public class CardTestTwo extends JPanel {
	private static final long serialVersionUID = 7139020098005091292L;

	public CardTestTwo() {
		setBackground(Color.white);
		setVisible(true);
	}

	public void paintComponent(Graphics window) {
		super.paintComponent(window);
		window.setFont(new Font("TAHOMA", Font.BOLD, 12));

		window.drawString("BLACKJACK CARD TEST", 90, 40);

		Card one = new BlackJackCard(10, "HEARTS", 90, 120);
		one.drawCard(window, 100, 100);

		Card two = new BlackJackCard(3, "CLUBS", 90, 120);
		two.drawCard(window, 200, 100);

		Card three = new BlackJackCard(9, "SPADES", 90, 120);
		three.drawCard(window, 300, 100);

		// instantiate more cards
	}
}