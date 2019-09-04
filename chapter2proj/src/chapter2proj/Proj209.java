package chapter2proj;

import java.util.Scanner;

public class Proj209 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Imma calc values of a sphere. \nGimme radius:  ");
		double radius = scan.nextDouble();
		
		double volume = Math.pow(radius, 3.0) * (4.0/3.0) * Math.PI;
		double surfaceArea = Math.pow(radius, 2.0) * 4.0 * Math.PI;
		
		System.out.println("The volyoom of ur sphere iz:  " + volume);
		System.out.print("The serface aeria of ur sphere iz:  " + surfaceArea);
	}
}
