package chapter3proj;

import java.util.Scanner;

public class Proj315 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Slots!\n\nEnter 1 to spin");
		
		int playing = scan.nextInt();
		
		while(playing == 1){
			int x = (int)(Math.random()*10);
			int y = (int)(Math.random()*10);
			int z = (int)(Math.random()*10);
			
			System.out.println("-------\n" + "| " + x + y + z + " |\n" + "-------");
			
			if(x == y && y == z)
				System.out.println("~*~Triple~*~");
			else if(x == y || y == z || x == z)
				System.out.println("Double!!");
			else
				System.out.println("No luck...");
			
			System.out.println("\n\nPlay again? (1 [yes] or 0 [no])");
			playing = scan.nextInt();
		}
	}
}