package chapter3proj;

import java.util.Scanner;

public class Proj303 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("What year is it? Enter a year before 1582 to exit");
		int year = scan.nextInt();
		
		while(year > 1581) {
			if(year % 4 == 0 && year % 100 == 0) {
				System.out.println("Yay! Leap year!");
			}
			else if(year % 100 != 0 && year % 4 == 0) {
				System.out.println("Yay! Leap year!");
			}
			else {
				System.out.println("No leep yr 4 u");
			}
			
			System.out.println("\nWhat year is it?");
			year = scan.nextInt();
		}
		
		System.out.println("EXITED");
	}
}