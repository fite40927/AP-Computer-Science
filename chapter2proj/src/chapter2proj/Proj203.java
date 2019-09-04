package chapter2proj;

import java.util.Scanner;

public class Proj203 {	
	public static void main(String[] args) {
		Scanner cansay = new Scanner(System.in);
		
		System.out.print("immegay umbernay:  ");
		double oneay = cansay.nextDouble();
		
		System.out.print("immegay umbernay:  ");
		double ootay = cansay.nextDouble();
		
		double summingForDummies = oneay + ootay;
		double differencingForDummies = oneay - ootay;
		double producingForDummies = oneay * ootay;
		
		System.out.println("umsay:  " + summingForDummies);
		System.out.println("ifferenceday:  " + differencingForDummies);
		System.out.println("oductpray:  " + producingForDummies);

	}
}