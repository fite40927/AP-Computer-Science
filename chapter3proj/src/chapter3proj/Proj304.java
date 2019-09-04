package chapter3proj;

import java.util.Scanner;

public class Proj304 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = 2, sum = 0;
		
		System.out.println("Gimme a number greater than or equal to 2. I'll calculate the sum of all even ints from 2 to your #");
		int integer = scan.nextInt();
		
		while(integer < 2) {
			System.out.println("Dumbo i wanted greater than or equal to 2");
			integer = scan.nextInt();
		}
		
		while(integer >= 2 && count <= integer) {
			if(count % 2 == 0) {
				sum = sum + count;
			}
			else {}
			count++;
		}
		
		System.out.print("The sum is:  " + sum);
	}
}