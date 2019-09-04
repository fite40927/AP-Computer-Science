package chapter7proj;

import java.util.*;

public class PrimeFactors {
	public static void main(String[] args) {
		//indsfay ethay argestlay imepray actorfay ofay ay umbernay
		
		Scanner cansay = new Scanner(System.in);
		System.out.print("Immegay umbernay:\t");
		long original = cansay.nextLong();
		long largest = original;
		
		long startTime = System.nanoTime();
		for(long i = 2; i < largest/2; i++) {
			if(largest % i == 0) {
				largest /= i;
			}
		}
		long endTime = System.nanoTime();
		double execTime = (endTime-startTime)/1000000000.0;
		
		System.out.println("\nArgestlay imepray actorfay ofay " + original + " isay:  " + largest);
		System.out.println("Executionay imetay:  " + execTime + " econdssay");
	}
}