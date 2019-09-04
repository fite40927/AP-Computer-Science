package chapter2proj;

import java.text.*;

public class Proj214 {
	public static void main(String[] args) {
		DecimalFormat secondFmt = new DecimalFormat("000");
		DecimalFormat firstFmt = new DecimalFormat("0");
		DecimalFormat thirdFmt = new DecimalFormat("0000");
		
		//First 3
		int first1 = (int) (Math.random() * 7);
		int first2 = (int) (Math.random() * 7);
		int first3 = (int) (Math.random() * 7);
		
		System.out.print(firstFmt.format(first1) + firstFmt.format(first2) + firstFmt.format(first3));
		
		//Second 3
		int secondSet = (int) (Math.random() * 742);
		System.out.print("-" + secondFmt.format(secondSet));
		
		//Last 4
		int thirdSet = (int) (Math.random() * 9999);
		System.out.print("-" + thirdFmt.format(thirdSet));
		
	}
}