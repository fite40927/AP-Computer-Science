package chapter2proj;

import java.util.*;

public class ExtraPrac {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);		
		
		System.out.print("Alphabetising two words \nWord: ");
		String firstWord = scan.next();
		String firstCap = firstWord.toUpperCase();
		
		for(int i = 0; i < firstCap.length(); i++) {
			while(firstCap.charAt(i) < 'A' || firstCap.charAt(i) > 'Z') {
				if(firstCap.charAt(i) == '-' && i != 0) {
					break;
				}
				
				System.out.print("Not a word \nWord: ");
				firstWord = scan.next();
				firstCap = firstWord.toUpperCase();
			
				if((firstCap.charAt(i) >= 'A' && firstCap.charAt(i) <= 'Z') && firstCap.charAt(0) != '-') {
					break;
				}
				else {
					
				}
			}
		}
				
		System.out.print("Another word: ");
		String secondWord = scan.next();
		String secondCap = secondWord.toUpperCase();
		
		for(int i = 0; i < secondCap.length(); i++) {
			while(secondCap.charAt(i) < 'A' || secondCap.charAt(i) > 'Z') {
				if(secondCap.charAt(i) == '-' && i != 0) {
					break;
				}
				
				System.out.print("Not a word \nWord: ");
				secondWord = scan.next();
				secondCap = secondWord.toUpperCase();
			
				if((secondCap.charAt(i) >= 'A' && secondCap.charAt(i) <= 'Z') && secondCap.charAt(0) != '-') {
					break;
				}
				else {
					
				}
			}
		}
		
		int alphabetise = firstCap.compareTo(secondCap);
		
		if(alphabetise > 0) {
			System.out.print(secondWord + " " + firstWord);
		}
		else {
			System.out.print(firstWord + " " + secondWord);
		}
		
	}

}