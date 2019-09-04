package chapter2proj;

import java.util.*;

public class Pointersmaybe {
	public static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {	
		
		System.out.print("Alphabetising two words \nWord: ");
		String firstWord = scan.next();
		String firstCap = firstWord.toUpperCase();

		whee(firstCap, firstWord);
				
		System.out.print("Another word: ");
		String secondWord = scan.next();
		String secondCap = secondWord.toUpperCase();

		whee(secondCap, secondWord);
		
		int alphabetise = firstCap.compareTo(secondCap);
		
		if(alphabetise > 0) {
			System.out.print(secondWord + " " + firstWord);
		}
		else {
			System.out.print(firstWord + " " + secondWord);
		}
		
	}
	
	private static void whee(String caps, String word) {
			
		for(int i = 0; i < caps.length(); i++) {
			while(caps.charAt(i) < 'A' || caps.charAt(i) > 'Z') {
				if(caps.charAt(i) == '-' && i != 0) {
					break;
				}
				
				System.out.print("Not a word \nWord: ");
				word = scan.next();
				caps = word.toUpperCase();
			
				if((caps.charAt(i) >= 'A' && caps.charAt(i) <= 'Z') && caps.charAt(0) != '-') {
					break;
				}
				else {
					
				}
			}
		}
		
	}

}