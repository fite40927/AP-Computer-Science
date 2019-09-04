package chapter3proj;

import java.text.DecimalFormat;

public class Proj307 {
	public static void main(String[] args) {
		DecimalFormat hund = new DecimalFormat("000");
		
		for(int row = 1; row < 13; row++) {
			if(row < 2) {
				System.out.print("       ");
				for(int a = 1; a < 13; a++) {
					System.out.print(hund.format(a) + "   ");
				}
				System.out.print("\n      ");
				for(int a = 1; a < 13; a++) {
					System.out.print("______");
				}
				System.out.println("");
			}
			System.out.print(hund.format(row) + "   |");
			for(int column = 1; column < 13; column++) {
				System.out.print(hund.format(row*column) + "   ");
			}
			System.out.println("");
		}
		
	}
}