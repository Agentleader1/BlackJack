package BlackJack;

//© A+ Computer Science  -  www.apluscompsci.com
//Name - 
//Date -
//Class -
//Lab  -

import javax.swing.JFrame;
import java.awt.Component;
import BlackJack.BlackJack;

public class TheGame extends JFrame {
	private static final int WIDTH = 800;
	private static final int HEIGHT = 600;

	public TheGame() {
		super("BLACKJACK");
		setSize(WIDTH, HEIGHT);

		BlackJack theGame = new BlackJack();
		((Component) theGame).setFocusable(true);

		getContentPane().add(theGame);

		setVisible(true);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String args[]) {
		TheGame run = new TheGame();
	}
}