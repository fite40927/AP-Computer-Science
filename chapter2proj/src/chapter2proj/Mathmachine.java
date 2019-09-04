package chapter2proj;

public class Mathmachine {
	public static void main(String[] args) {
		int number = (int)(Math.random()*91 + 10);
		
		int squared = (int)(Math.pow(number, 2));
		double cubed = Math.pow(number, 3);
		double sqrt = Math.sqrt(number);
		double cbrt = Math.cbrt(number);
		
		System.out.println("Number: " + number);
		System.out.println("Squared: " + squared);
		System.out.println("Cubed: " + cubed);
		System.out.println("Square root: " + sqrt);
		System.out.println("Cube root: " + cbrt);
	}
}