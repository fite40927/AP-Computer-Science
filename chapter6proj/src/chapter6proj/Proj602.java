package chapter6proj;

import java.util.Scanner;

public class Proj602 {
	public static void main(String[] args) {
		System.out.print("# of integers (from [-25] to [25]) being entered:\t");
		Scanner scan = new Scanner(System.in);
		double enter = -1;
		while(enter < 1) {
			enter = scan.nextDouble();
		}
		int num =(int)(enter);
		int numArr[] = new int[num];
		
		for(int i = 0; i < numArr.length; i++) {
			System.out.print("#:\t");
			int x = 52;
			while(x < -25 || x > 25) {
				x = scan.nextInt();
			}
			numArr[i] = x;
		}
		
		int count[] = new int[51];
		
		for(int y = 0; y < 51; y++) {
			for(int i = 0; i < numArr.length; i++) {
				if(numArr[i] == y-25) count[y]+=1;
			}
		}
		for(int i = 0; i < count.length; i++) {
			if(count[i] != 0)
				System.out.println(i-25 + ":\t" + count[i]);
		}
	}
}
