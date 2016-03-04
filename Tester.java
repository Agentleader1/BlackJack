package BlackJack;

import javax.swing.JFrame;

public class Tester extends JFrame {

	private static final long serialVersionUID = -1659119203785885037L;
	private static final int WIDTH = 800;
	private static final int HEIGHT = 600;

	public Tester() {
		super("BLACKJACK TESTER");
		setSize(WIDTH, HEIGHT);

		CardTestTwo cardTest = new CardTestTwo();
		getContentPane().add(cardTest);

		// DeckTestTwo deckTest = new DeckTestTwo();
		// ((Component)deckTest).setFocusable(true);
		// getContentPane().add(deckTest);

		// PlayerTestTwo playerTest = new PlayerTestTwo();
		// ((Component)playerTest).setFocusable(true);
		// getContentPane().add(playerTest);

		setVisible(true);
	}

	public static void main(String args[]) {
		new Tester();
	}
}