package chapter2proj;

import java.util.Scanner;

public class Proj206 {
	public static void main(String[] args) {
		Scanner cansay = new Scanner(System.in);
		
		System.out.print("Imma converto ahwers, minyootes, and secindes ALL to secindes\n\nimmegay ahwersay:  ");
		double ahwersay = cansay.nextDouble();
		System.out.print("immegay inyootesmay:  ");
		double inyootesmay = cansay.nextDouble();
		System.out.print("immegay ecindessay:  ");
		double ecindessay = cansay.nextDouble();
		
		double hours2seconds = ahwersay * 3600;
		double minutes2seconds = inyootesmay * 60;
		double totalSecindes = hours2seconds + minutes2seconds + ecindessay;
		
		System.out.print(ahwersay + " hoursay " + inyootesmay + " inyootesmay anday " + ecindessay + " ecindessay equalsay:  " + totalSecindes + " ecindessay");
	}
}