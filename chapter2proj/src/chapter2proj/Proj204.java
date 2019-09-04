package chapter2proj;

import java.util.Scanner;

public class Proj204 {
	public static void main(String[] args) {
		Scanner cansay = new Scanner(System.in);
		
		System.out.print("immegay egreesday inay arenheitfay:  ");
		double ahrenheitfay = cansay.nextDouble();
		
		double elsiuscay = (ahrenheitfay - 32.0) * (5.0 / 9.0);
		
		System.out.print(ahrenheitfay + " egreesday ahrenheitfay inay elsiuscay isay:   " + elsiuscay);
	}
}