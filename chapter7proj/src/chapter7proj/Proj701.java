package chapter7proj;

public class Proj701 {
	public static void main(String[] args) {
		MonetaryCoin x = new MonetaryCoin();
		MonetaryCoin y = new MonetaryCoin();
		MonetaryCoin z = new MonetaryCoin();
		
		int sum = x.getValue() + y.getValue() + z.getValue();
		System.out.println(sum);
		
		x.flip();
		y.flip();
		z.flip();
		
		if(x.isHeads()) System.out.println("h");
		else System.out.println("t");
	}
}