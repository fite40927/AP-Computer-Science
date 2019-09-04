package chapter6proj;

public class Proj608 {
	public static void main(String[] args) {
		Deck myDeck = new Deck();
		myDeck.shuffle(520);
		while(myDeck.cardsLeft() > 0) {
			Card x = myDeck.hit();
			System.out.println(x.getFace() + "\t" + x.getSuit());
		}
	}
}
