package chapter2proj;

import java.util.Scanner;

public class Proj205 {
	public static void main(String[] args) {
		Scanner cansay = new Scanner(System.in);
		
		System.out.print("immegay ilesmay:  ");
		double ilesmay = cansay.nextDouble();
		
		double ilometreskay = ilesmay * 1.60935;
		
		System.out.print(ilesmay + " ilesmay isay:  " + ilometreskay + " ilometreskay");
	}
}