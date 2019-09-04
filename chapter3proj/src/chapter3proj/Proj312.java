package chapter3proj;

public class Proj312 {
	public static void main(String[] args) {
		char astk = '*';
		
		//a
		for(int i = 10; i > 0; i--) {
			for(int x = 0; x < i; x++) {
				System.out.print(astk);
			}
			System.out.println();
		}
		
		System.out.println('\n');
		
		//b
		for(int i = 0; i < 11; i++) {
			for(int x = 0; x < i; x++) {
				System.out.print(astk);
			}
			System.out.println();
		}
		
		System.out.println('\n');
		
		//c
		int space = 0;
		for(int i = 10; i > 0; i--) {
			for(int y = 0; y < 10-i; y++) {
				System.out.print(' ');
			}
			for(int x = 0; x < i; x++) {
				System.out.print(astk);
			}
			System.out.println();
		}
		
		System.out.println('\n');
		
		//d
		for(int i = 0; i < 6; i++) {
			for(int y = 0; y < 5-i; y++) {
				System.out.print(' ');
			}
			for(int x = 0; x < 2*i-1; x++) {
				System.out.print(astk);
			}
			System.out.println();
		}
		for(int i = 5; i > 0; i--) {
			for(int y = 0; y < 5-i; y++) {
				System.out.print(' ');
			}
			for(int x = 0; x < 2*i-1; x++) {
				System.out.print(astk);
			}
			System.out.println();
		}
	}
}