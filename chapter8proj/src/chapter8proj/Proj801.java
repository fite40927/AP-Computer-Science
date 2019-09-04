package chapter8proj;

public class Proj801 {
	public static void print(String s) {
		System.out.println(s);
	}
	public static String isit(String x) {
		x = x.toLowerCase();
		
		if(x.length() <= 1) 
			return "palindrome";
		else {
			if(x.charAt(0) != x.charAt(x.length()-1))
				return "not a palindorme";
			else
				return isit(x.substring(1,x.length()-1));
		}
	}
	public static void main (String[] args) {
		String[] a = {"mom", "racecar","dood","pali"};
		for(int i = 0; i < a.length; i++)
			System.out.println(a[i] + "\t\t" + isit(a[i]));
	}
}