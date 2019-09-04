package chapter4proj;

//4.6

public class Card {
	public int faceValue, suitX;
	public String suit, face;
	public static Card draw;
	
	public Card() {
		face = null;
		suit = null;
	}
	
	public void Draw() {
		System.out.println(draw.getFaceVal() + " of " + draw.getSuit());
	}
	
	public String getFaceVal() {
		faceValue = (int)(Math.random()*13+1);
		
		if(faceValue == 1) face = "Ace";
		else if(faceValue == 11) face = "Jack";
		else if(faceValue == 12) face = "Queen";
		else if(faceValue == 13) face = "King";
		else face = "" + faceValue;
		
		return face;
	}
	
	public String getSuit() {
		suitX = (int)(Math.random()*4+1);
		
		if(suitX == 1) suit = "Spades";
		if(suitX == 2) suit = "Hearts";
		if(suitX == 3) suit = "Clubs";
		if(suitX == 4) suit = "Diamonds";
		
		return suit;
	}
	
	public static void main (String[] args) {
		draw = new Card();
		
		for(int i = 0; i <20; i++) {
			draw.Draw();
		}		
	}
	
}