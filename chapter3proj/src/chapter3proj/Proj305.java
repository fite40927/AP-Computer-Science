package chapter3proj;

import java.util.Scanner;

public class Proj305 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Input word:  ");
		String x = scan.next();
		
		for(int i = 0; i < x.length(); i++) {
			System.out.println(x.charAt(i));
		}
	}
}