package chapter3proj;

import java.util.Scanner;

public class Proj306 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("gimme integer:  ");
		int integer = scan.nextInt(), even = 0, odd = 0, zero = 0;
		integer = Math.abs(integer);
		
		String intString = Integer.toString(integer);
		
		for(int i = 0; i < intString.length(); i++) {
			if(intString.charAt(i) == '0')
				zero++;
			else if(intString.charAt(i) % 2 == 0)
				even++;
			else
				odd++;				
		}
		
		/*
		 for(int i = 0; i < intString.length(); i++) {
			if(Character.getNumericValue(intString.charAt(i)) == 0)
				zero++;
			else if(Character.getNumericValue(intString.charAt(i)) % 2 == 0)
				even++;
			else
				odd++;				
		}
		 */
		
		System.out.println("Evens: " + even);
		System.out.println("Odds: " + odd);
		System.out.println("Zeroes: " + zero);
	
	}
}



/*
package chapter3proj;

import java.util.Scanner;

public class Proj306 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("gimme integer:  ");
		int integer = scan.nextInt(), x = -1, numPlace = -1, even = 0, odd = 0, zero = 0;
		integer = Math.abs(integer);
		
		//power of 10??
		while(integer > 0) {
			for(int i = 10; x != 0; i = i*10) {
				x = integer / i;
				if(x == 0)
					numPlace = i/10;
			}
			
			x= -1;
			
			int firstPlace = integer / numPlace;
			if(firstPlace % 2 == 0 && firstPlace != 0)
				even++;
			else if(firstPlace % 2 != 0 && firstPlace != 0)
				odd++;
			else
				zero++;
			
			integer = integer - (firstPlace * numPlace);
		}
		
		System.out.println("Evens: " + even);
		System.out.println("Odds: " + odd);
		System.out.println("Zeroes: " + zero);
	
	}
}
*/