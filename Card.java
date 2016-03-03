package BlackJack;

import java.net.URL;
import java.awt.Graphics;
import java.awt.Image;
import javax.imageio.ImageIO;

import com.alex.apcs.utils.UtilRandomNumbers;

import BlackJack.Card;

public abstract class Card {
	public static final String FACES[] = { "ZERO", "ACE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT",
			"NINE", "TEN", "JACK", "QUEEN", "KING" };
	public static final String SUITS[] = { "SPADES", "DIAMONDS", "HEARTS", "CLUBS"};
	private String suit;
	private int face;
	private int width;
	private int height;
	private Image image;

	public Card() {
		this(UtilRandomNumbers.getRandomInteger(1, 13), SUITS[UtilRandomNumbers.getRandomInteger(0, 3)]);
	}

	public Card(int f, String s) {
		this(f, s, 0, 0);
	}

	public Card(int f, String s, int wid, int ht) {
		// set instance variables to parameter values
		// intialize all instance variables
		face = f;
		suit = s;
		width = wid;
		height = ht;
		String name = this.toString().replaceAll(" ", "");
		try {
			URL url = getClass().getResource("/images/" + name + ".jpg");
			image = ImageIO.read(url);
		} catch (Exception e) {
			// feel free to do something here
		}
	}

	// modifiers
	public void setFace(int f) {
		face = f;
	}

	// add more set methods
	public void setSuit(String suit) {
		this.suit = suit;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	// accessors
	public String getSuit() {
		return suit;
	}
	
	public int getFace() {
		return face;
	}
	
	public int getWidth() {
		return width;
	}
	
	public int getHeight() {
		return height;
	}

	// add more get methods

	@Override
	public boolean equals(Object obj) {
		// add in code to complete the equals method
		if (obj instanceof Card) {
			Card c = (Card) obj;
			return face == c.face && suit.equalsIgnoreCase(c.suit);
		} else
			return false;
	}

	public abstract int getValue();

	public String toString() {
		// get rid of the has a value of - getValue()
		// before you start the graphics part
		// with the images -check the image names
		return FACES[face] + " of " + getSuit();
	}

	public void drawCard(Graphics window, int x, int y) {
		window.drawImage(image, x, y, width, height, null);
	}
}