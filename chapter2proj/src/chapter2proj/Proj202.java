package chapter2proj;

import java.util.Scanner;

public class Proj202 {
	public static void main(String[] args) {
		Scanner scandinavia = new Scanner(System.in);
		
		System.out.print("Gimme number:  ");
		int diyige = scandinavia.nextInt();
		
		System.out.print("Gimme number:  ");
		int diliangge = scandinavia.nextInt();
		
		System.out.print("Gimme number:  ");
		int disange = scandinavia.nextInt();
		
		double scandinavianNumberAverage = (diyige + diliangge + disange)/3.0;
		
		System.out.println("\nAvg of numbers: " + scandinavianNumberAverage);
	}
}