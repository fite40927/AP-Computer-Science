package chapter4proj;

import java.util.Scanner;

public class Dice {
	public static int faceValue, numFaces;
	public static Dice die;
	
	public Dice(int userFace){
		if(userFace < 4) {
			System.out.println("Dice must have at least 4 sides. Reverting your die to 4 sides...");
			numFaces = 4;
		}
		else
			numFaces = userFace;
	}
	
	public static int diceRoll () {
		System.out.println("Rolling...");
		faceValue = (int)(Math.random()*numFaces + 1);
		return faceValue;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("How many sides does your die have?");
		int faces = scan.nextInt();
		die = new Dice(faces);
		System.out.println(die.diceRoll());
	}
}