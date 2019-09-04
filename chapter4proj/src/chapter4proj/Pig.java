package chapter4proj;

//4.5

import java.util.*;
import java.util.concurrent.TimeUnit;

public class Pig {
	public boolean roundEnd = false, gameOver = false, changePlayers = false;
	public int faceVal;
	private die die;
	private Scanner scan = new Scanner(System.in);
	private Player program, user, currentPlayer;
	
	class die {
		public die(){
			faceVal = 1;
		}
		public int roll() {
			faceVal = (int)(Math.random()*6+1);
			return faceVal;
		}
	}

	public Pig(){
		program = new Player();
		user = new Player();
		die = new die();
	}
	public void play () {
		currentPlayer = program;
		
		while(!gameOver) {
			roundEnd = false;
			
			if(currentPlayer==program)
				System.out.println("\n-----------\nCurrent player:\tprogram");
			else if(currentPlayer == user)
				System.out.println("\n-----------\nCurrent player:\tuser");
			
			
			currentPlayer.myTurn();
			
			if(currentPlayer.myPoints() >= 100)
				gameOver = true;
			else { 
				gameOver = false;
			
				if(changePlayers) {
					if(currentPlayer == program)
						currentPlayer = user;
					else
						currentPlayer = program;
				}
			}
		}
	
		if(currentPlayer == user)
			System.out.println("\n\nYOU HAVE WON.");
		else
			System.out.println("\n\nYOU HAVE LOST.");
	}
		
	class Player {
		private int pointsRound, pointsTotal;
		
		Player() {
			pointsRound = 0;
			pointsTotal = 0;
		}
		
		public void  myTurn() {
			
			String yn = null;
			
			while(!roundEnd) {
				int die1Roll = die.roll(), die2Roll = die.roll();
				int diTotal = die1Roll+die2Roll;
				System.out.println("Rolling... ");
				try { Thread.sleep(750); } catch(InterruptedException ex) { Thread.currentThread().interrupt();}
				System.out.println(""+ die1Roll + "\t" + die2Roll);
				if(die1Roll == 1 || die2Roll == 1) {
					pointsRound = 0;
					if(die1Roll == 1 && die2Roll == 1)
						pointsTotal = 0;
					roundEnd = true;
				}
				else {
					pointsRound += diTotal;
					
					System.out.println("Points this round:\t" + pointsRound + "\nTotal points:\t" + pointsTotal);
					
					if((currentPlayer == program && pointsRound >= 20) || pointsTotal+pointsRound >= 100)
						roundEnd = true;
					if(currentPlayer == user) {		
						System.out.println("Roll again? (y/n)");
						yn = scan.next();
						if(yn.equalsIgnoreCase("n"))
							roundEnd = true;
						else;
					}
				}
			}
			pointsTotal += pointsRound;
			System.out.println("\nROUND END\nTotal points:\t" + pointsTotal);
			try { Thread.sleep(2000); } catch(InterruptedException ex) { Thread.currentThread().interrupt();}
			pointsRound = 0;
			changePlayers = true;
		}
		public int myPoints() {
			return pointsTotal;
		}
	}
	
	public static void main(String[] args) {
		Pig game = new Pig();
		game.play();
	}
}