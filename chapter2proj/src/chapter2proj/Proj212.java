package chapter2proj;

import java.text.NumberFormat;
import java.util.*;

public class Proj212 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		NumberFormat mula = NumberFormat.getCurrencyInstance();
		
		System.out.print("Imma calculate ur jar $$$ \nGimme # of quarters:  ");
		int quarters = scan.nextInt();
		System.out.print("Gimme # of dimes:  ");
		int dimes = scan.nextInt();
		System.out.print("Gimme # of nickels:  ");
		int nickels = scan.nextInt();
		System.out.print("Gimme # of pennies:  ");
		int pennies = scan.nextInt();
		
		double monet = quarters*0.25 + dimes*0.1 + nickels*0.05 + pennies*0.01;
		
		System.out.print("U haf:  " + mula.format(monet));
	}
}