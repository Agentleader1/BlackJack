package BlackJack;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import javax.swing.JFrame;
import java.awt.Component;
import BlackJack.BlackJack;

public class Tester extends JFrame
{
	private static final int WIDTH = 800;
	private static final int HEIGHT = 600;

	public Tester()
	{
		super("BLACKJACK TESTER");
		setSize(WIDTH,HEIGHT);
		
		CardTestTwo cardTest = new CardTestTwo();		
		getContentPane().add(cardTest);
				
		//DeckTestTwo deckTest = new DeckTestTwo();
		//((Component)deckTest).setFocusable(true);		
		//getContentPane().add(deckTest);
		
		//PlayerTestTwo playerTest = new PlayerTestTwo();
		//((Component)playerTest).setFocusable(true);	
		//getContentPane().add(playerTest);
								
		setVisible(true);
	}
	
	public static void main( String args[] )
	{
		Tester run = new Tester();
	}
}