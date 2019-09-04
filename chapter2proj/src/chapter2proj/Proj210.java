package chapter2proj;

import java.util.Scanner;

public class Proj210 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Gimme three sides of a triangle. Imma calc the area \nSide 1:  ");
		double side1 = scan.nextDouble();
		System.out.print("Side 2:  ");
		double side2 = scan.nextDouble();
		System.out.print("Side 3:  ");
		double side3 = scan.nextDouble();
		
		double perimeter = (side1 + side2 + side3) / 2;
		
		double area = Math.pow((perimeter * (perimeter-side1) * (perimeter-side2) * (perimeter-side3)), 0.5);
		
		System.out.print("Area:  " + area);
	}
}