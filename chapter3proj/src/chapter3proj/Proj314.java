package chapter3proj;

import java.util.Scanner;

public class Proj314 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int playing = 1, choice = 1;
		int tie = 0, win = 0, loss = 0;
		String x;
		
		print("Let's play!\nEnter 0 at any time to exit");
		
		while(playing == 1 && choice > 0 && choice < 4) {
			print("\nRock paper scissors... (1 = Rock, 2 = Paper, 3 = Scissors)");
			int cpu = (int)(Math.random()*3+1);
			choice = scan.nextInt();
			
			if(cpu == 1)
				x = "Rock";
			else if(cpu == 2)
				x = "Paper";
			else
				x = "Scissors";
			
			print("" + x + "!");
			print("");
			
			if(choice-1 == cpu || choice-cpu == -2) {
				win++;
				print("Yay! You won!");
			}
			else if(choice+1 == cpu || choice-cpu == 2) {
				loss++;
				print("HA! I won :)");
			}
			else {
				tie++;
				print("Tie...");
			}
			
			print("\n\nWould you like to play again??  (1 = yes, 0 = no)");
			playing = scan.nextInt();
		}
		
		print("\n\nYou:  " + win);
		print("CPU:  " + loss);
		print("Ties:  " + tie);
	}

	private static void print(String string) {
		System.out.println(string);
	}
}
