package chapter3proj;

import java.util.*;

//program to produce RUNTIME error

public class Proj301 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Average of Numbers \n\nEnter all the integers you want.\nEnter p to stop");
		int integer = scan.nextInt(), count = 0, sum = 0;
		double average = 0;
				
		while(scan.hasNextInt()) {
			count++;
			sum = sum + integer;
			average = (sum*1.0)/count;
			
			integer = scan.nextInt();
		}
		System.out.print("\nThe average of ALLLL your numbers is:  " + average);
	}
}