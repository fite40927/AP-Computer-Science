package chapter2proj;

import java.util.Scanner;

public class Proj211 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Gimme inital gallons:  ");
		double gallonsI = scan.nextDouble();
		System.out.print("Gimme miles driven:  ");
		double milesDriven = scan.nextDouble();
		System.out.print("Gimme final gallons:  ");
		double gallonsF = scan.nextDouble();
		
		double mpg = milesDriven / (gallonsI - gallonsF);
		
		System.out.print("Ur veehickle's efficiency is:  " + mpg + " miles per gallon");
	}
}
