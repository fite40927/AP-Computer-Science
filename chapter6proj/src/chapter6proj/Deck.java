package chapter6proj;

public class Deck {
	public Card deck[];
	public int idx;
	public Deck() {
		deck = new Card[52];
		
		int idx = 0;
		for(int i = 1; i < 5; i++) {
			for(int x = 1; x < 14; x++) {
				deck[idx] = new Card(x, i);
				idx++;
			}
		}
	}
	public void shuffle(int times) {
		Card placeCard = new Card(0, 0);
		int a, b;
		
		for(int i = 0; i < times; i++) {
			for(int z = 0; z < 26; z++) {
				a = (int)(Math.random()*52);
				b = (int)(Math.random()*52);
				placeCard = deck[a];
				deck[a] = deck[b];
				deck[b] = placeCard;
			}
		}
	}
	public Card hit() {
		idx++;
		return deck[idx-1];
	}
	public int cardsLeft() {
		return deck.length-idx;
	}
}
