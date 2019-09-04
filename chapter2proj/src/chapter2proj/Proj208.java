package chapter2proj;

import java.util.Scanner;

public class Proj208 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Imma kalkyulate disdance. \nGimme x-coord:  ");
		double xval = scan.nextDouble();
		System.out.print("Gimme y-coord:  ");
		double yval = scan.nextDouble();
		
		System.out.print("\nGimme nother x-coord:  ");
		double xval2 = scan.nextDouble();
		System.out.print("Gimme nother y-coord:  ");
		double yval2 = scan.nextDouble();
		
		double distance = Math.sqrt(Math.pow((xval-xval2), 2) + Math.pow((yval-yval2),2));
		
		System.out.println("\n\nThe distance between (" + xval + ", " + yval + ") and (" + xval2 + ", " + yval2 + ") is:");
		System.out.print(Math.abs(distance));
	}
}