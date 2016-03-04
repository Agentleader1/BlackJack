package BlackJack;

import java.awt.Component;

import javax.swing.JFrame;

public class FinalGameGraphicsRunner extends JFrame {

	private static final long serialVersionUID = 3414745321474204948L;
	private static final int WIDTH = 800;
	private static final int HEIGHT = 600;

	public FinalGameGraphicsRunner() {
		super("BLACKJACK");
		setSize(WIDTH, HEIGHT);

		BlackJack FinalGameRunner = new BlackJack();
		((Component) FinalGameRunner).setFocusable(true);

		getContentPane().add(FinalGameRunner);

		setVisible(true);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String args[]) {
		new FinalGameGraphicsRunner();
	}
}