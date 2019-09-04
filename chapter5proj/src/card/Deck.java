package card;

import java.util.Scanner;

public class Deck {
	public Card deck[];
	
	public Deck() {
		deck = new Card[52];
		
		int deckIdx = 0;
		for(int i = 1; i < 5; i++) {
			for(int x = 1; x < 14; x++) {
				deck[deckIdx] = new Card(x, i);
				deckIdx++;
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
	public void deal(int strtIdx, int deal) {
		Card placeCard = new Card(0, 0);
		if(deal+strtIdx > 52) {
			deal = 52-strtIdx;
			System.out.println("there rnt dat many cards lft in da deck dude\nimma just give ya wots lft\n");
		}
		for(int i = strtIdx; i < strtIdx+deal; i++) {
			placeCard = deck[i];			
			System.out.println(placeCard.getFace() + "\t" + placeCard.getSuit());
		}
	}
	
	public static void main(String[] args) {
		Deck bicycle = new Deck();
		Scanner scan = new Scanner(System.in);
		int dkIdx = 0;
		bicycle.shuffle(700);
		System.out.println("Choo haf vahn deck ohf cardz, choofulled 700 tymz\n");
		while(dkIdx < 52) {
			System.out.println("hOW maNy CaRDS u VAnt?");
			int b = scan.nextInt();
			System.out.println();bicycle.deal(dkIdx, b);
			dkIdx+=b;
			System.out.println();
		}
		System.out.print("nO mORe CarDs");
	}
}
