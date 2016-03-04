package BlackJack;
//© A+ Computer Science  -  www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  - 

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

@SuppressWarnings("unused")
public class PlayerTestTwo extends JPanel implements KeyListener {

	private static final long serialVersionUID = -2255343514269475128L;
	private Deck deck;
	private Player player;
	private Font font;
	private boolean start;
	private boolean hit;
	private boolean finish;
	private boolean show;

	public PlayerTestTwo() {
		setBackground(Color.white);

		deck = new Deck();
		player = new Player();

		font = new Font("TAHOMA", Font.BOLD, 12);

		this.addKeyListener(this); // starts the key thread running
	}

	public void paintComponent(Graphics window) {
		super.paintComponent(window);

		window.setColor(Color.blue);
		window.setFont(font);
		window.drawString("BlackJack Player Test", 25, 50);
		window.drawString("PRESS B to add cards to your hand.", 25, 100);

		if (start == true) {
			deck.shuffle();
			player.addCardToHand(deck.nextCard());
			player.addCardToHand(deck.nextCard());
			start = false;
			show = false;
		}

		window.drawString("PLAYER ", 50, 365);
		player.drawHand(window, 0, 365);
	}

	public void keyTyped(KeyEvent e) {
		if (e.getKeyChar() == 'b' || e.getKeyChar() == 'B') {
			start = true;
			repaint();
		}
	}

	public void keyPressed(KeyEvent e) {
	}

	public void keyReleased(KeyEvent e) {
	}
}