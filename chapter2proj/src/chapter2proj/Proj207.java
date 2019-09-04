package chapter2proj;

import java.util.Scanner;

public class Proj207 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Gimme seconds (no decimals):  ");
		int seconds = scan.nextInt();
		
		int hours = seconds / 3600;
		
		//x is the seconds allotted for minutes and seconds
		int x = seconds - hours*3600;
		
		int minutes = x / 60;
		
		int spareSeconds = x - minutes*60;
		
		
		System.out.print(hours + " hours " + minutes + " minutes " + spareSeconds + " seconds");
	}
}