package card;

public class Card {
	private int faceValue, suitValue;
	public Card(int newFace, int newSuit){
        faceValue = newFace;
        suitValue = newSuit;
   }
	public String getFace() {
		if(faceValue == 1) {return "Ace";}
		else if(faceValue == 11) {return "Jack";}
		else if(faceValue == 12) {return "Queen";}
		else if(faceValue == 13) {return "King";}
		else return Integer.toString(faceValue);
	}
	public String getSuit() {
		if(suitValue == 1) return "Spades";
		else if(suitValue == 2) return "Hearts";
		else if(suitValue == 3) return "Clubs";
		else return "Diamonds";
	}
}