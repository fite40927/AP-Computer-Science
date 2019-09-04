package chapter3proj;

import java.util.Scanner;

public class Proj302 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("What year is it?");
		int year = scan.nextInt();
		
		if(year < 1582)
			System.out.print("Sorry, gregorian calendar wasn't invented then");
		
		if(year % 4 == 0 && year % 100 == 0)
			System.out.print("Yay! Leap year!");
		else if(year % 100 != 0 && year % 4 == 0)
			System.out.print("Yay! Leap year!");
		else
			System.out.print("No leep yr 4 u");
	}
}