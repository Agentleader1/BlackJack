package BlackJack;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

import static java.lang.System.*;
import java.awt.Color;

import BlackJack.Card;
import BlackJack.BlackJackCard;
import BlackJack.Deck;
import BlackJack.AbstractPlayer;
import BlackJack.Player;

public class PlayerTestOne
{
	public static void main( String args[] )
	{
		Player player = new Player();	
		
		Deck deck = new Deck();
		deck.shuffle();
		
		player.addCardToHand(deck.nextCard());
		player.addCardToHand(deck.nextCard());

		out.println("\n\ntoString");
		out.println(player);	
		
		out.println("\n\nhandValue");
		out.println(player.getHandValue());					
		
		player.addCardToHand(deck.nextCard());
		player.addCardToHand(deck.nextCard());

		out.println("\n\ntoString");
		out.println(player);	
		
		out.println("\n\nhandValue");
		out.println(player.getHandValue());									
	}
}