package chapter3proj;

import java.util.Scanner;

public class Proj310 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = 0, number = 0;
		double guess = 0.0;
		boolean playing = true;
		
		while(playing) {
			if(x == 0) {
				System.out.println("\n---------------------------------------------------\n");
				System.out.println("HI-LO\n\nTry to guess my number! It's an int between 1-100");
				System.out.println("Enter a number outside that range to quit\n");
				number = (int)(Math.random() * 100);
				guess = scan.nextDouble();
				x++;
			}
			
			if(guess > 100 || guess < 0)
				playing = false;
			
			else if(number > guess) {
				System.out.println("LO");
				guess = scan.nextDouble();
			}
			else if (number < guess){
				System.out.println("HI");
				guess = scan.nextDouble();
			}
			else {
				System.out.println("\n\nCorrect. My number was " + number + "\nWould you like to play again?");
				String yesno = scan.next();
				if(yesno.toLowerCase().charAt(0) == 'y') {
					number = (int)(Math.random() * 100);
					x = 0;
				}
				else
					playing = false;
			}
			
		}
	}
}
