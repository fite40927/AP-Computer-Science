package chapter3proj;

import java.util.Scanner;

public class MultUser {
	private static void print(String s) {
		System.out.println(s);
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		print("Column starting #:");
		int start1 = scan.nextInt();
		print("Row starting #:");
		int start2 = scan.nextInt();
		
		print("");
		
		for(int row = start2; row < start2+10; row++) {
			if(row < start2+1) {
				System.out.print("\t");
				for(int a = start1; a < start1+10; a++) {
					System.out.printf("%4s", a);
					System.out.print( "\t");
				}
				System.out.print("\n\t");
				for(int a = start1; a < start1+ 10; a++) {
					System.out.print("________");
				}
				System.out.println("");
			}
			
			System.out.printf("%4s", row);
			System.out.print("\t|");
			for(int column = start1; column < start1+10; column++) {
				System.out.printf("%4s", row*column);
				System.out.print("\t");
			}
			System.out.println();
		}
		
	}
}