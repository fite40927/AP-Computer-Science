package chapter2proj;

import java.util.*;

public class Nickname {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Imma gif u a nickname. \nWas ur first name?");
		String firstName = scan.next();
		firstName = firstName.toUpperCase();
		
		System.out.println("Last name?");
		String lastName = scan.next();
		lastName = lastName.toLowerCase();
		
		char firstLetter = firstName.charAt(0);
		String lastFour;
		
		if(lastName.length() < 4) {
			lastFour = lastName;
		}
		else {
			lastFour = lastName.substring(0, 4);
		}
		
		System.out.println("HA! UR NICKNAME IS " + firstLetter + lastFour);
	}
}