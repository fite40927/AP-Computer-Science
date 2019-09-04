package chapter8proj;

public class Proj802 {
	public static int gcd(int num1, int num2) {
		if(num2 <= num1 && num1 % num2 == 0)
			return num2;
		else if(num1 < num2)
			return gcd(num2, num1);
		else
			return gcd(num2, num1%num2);
	}
	public static void main(String[] args) {
		int[] nums = {4,2,3,6,9,63};
		
		for(int i = 0; i+1 < nums.length; i++)
			System.out.println("" + nums[i] + "," + nums[i+1] + "\t\t" + gcd(nums[i], nums[i+1]));
	}
}