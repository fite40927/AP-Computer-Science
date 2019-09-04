package chapter8proj;

public class Experimenting {
	public static int sum(int num) {
		int result;
		if(num==1) result = 1;
		else result = num + sum(num-1);
		return result;
	}
	public static void main(String args[]) {
		for(int i = 1; i < 10; i++)
			System.out.println(sum(i));
	}
}
