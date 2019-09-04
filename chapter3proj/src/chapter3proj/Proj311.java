package chapter3proj;

import java.util.Scanner;

public class Proj311 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str, playing = "y";
		int left, right;
		
		while (playing.equalsIgnoreCase("y")){
			System.out.println("Enter a potential palindrome");
			str = scan.nextLine();
			
			str = str.toLowerCase();
			for(int i = 0; i < str.length(); i++) {
				if(!Character.isLetter(str.charAt(i)) || str.charAt(i) == ' ') {
					str = str.replace(Character.toString(str.charAt(i)), "");
					i = 0;
				}
			}
			
			left = 0;
			right = str.length()-1;
	
			while(str.charAt(left) == str.charAt(right) && left != str.length()-1) {
				left++;
				right--;
			}
			
			if(left > right)
				System.out.println("Yay! Palindrome!");
			else
				System.out.println("Nope.");
			System.out.print("Test more words? y/n");
			playing = scan.nextLine();
		}
	}
}
