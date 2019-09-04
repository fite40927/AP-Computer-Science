package chapter6proj;

import java.util.Scanner;

public class Proj604 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int enter = -1;
		System.out.print("# of integers (range 1-100) to enter:\t");
		while(enter < 1) {
			enter = scan.nextInt();
		}
		int[] nums = new int[enter];
		
		for(int i = 0; i < nums.length; i++) {
			enter = 0;
			System.out.print("#:\t");
			while(enter < 1 || enter > 100) {
				enter = scan.nextInt();
			}
			nums[i] = enter;
		}
		
		System.out.println();
		
		for(int i = 0; i < 10; i++) {
			int min = (i*10)+1; int max = min+9;
			System.out.print(min + "-" + max + "\t|  ");
			
			for(int j = 0; j < nums.length; j++) {
				if(nums[j] >= min && nums[j] <= max) System.out.print("*");;
			}
			System.out.println();
		}
	}
}
