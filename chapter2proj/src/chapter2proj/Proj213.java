package chapter2proj;

public class Proj213 {
	public static void main(String[] args) {
		
		int num = (int) (Math.random() * 10);
		System.out.println("From 0 to 9: " + num);
		num = (int) (Math.random() * 10 + 1);
		System.out.println("From 1 to 10: " + num);
		num = (int) (Math.random() * 14 + 20);
		System.out.println("From 20 to 34: " + num);
		num = (int) (Math.random() * 19 -10);
		System.out.println("From -10 to 9: " + num);
		
		System.out.println("A Math.random double [between 0-1]: " + (double) Math.random());
		
		num = (int) (Math.random() * 6 + 1);
		System.out.println("From 1 to 6 inclusive: " + num);
		
		
	}
}