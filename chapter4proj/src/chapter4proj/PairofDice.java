package chapter4proj;

//4.4

public class PairofDice {
	private int faceVal, val1, val2, valTotal;
	private Dice die1, die2;
	
	
	///////////////////////////////
	class Dice {
		public Dice(){
			faceVal = 1;
		}
		public int roll() {
			faceVal = (int)(Math.random()*6+1);
			return faceVal;
		}
	}
	////////////////////////////////
	
	
	public PairofDice() {
		die1 = new Dice();
		die2 = new Dice();
	}
	public int rollBoth() {
		val1 = die1.roll();
		val2 = die2.roll();
		valTotal = val1+val2;
		return valTotal;
	}
	public int rollOne() {
		val1 = die1.roll();
		return val1;
	}
	public int rollTwo() {
		val2 = die2.roll();
		return val2;
	}
	
	public static void main(String[] args) {
		PairofDice dicey = new PairofDice();
		int count = 0;
		for(int i = 0; i <1000; i++) {
			int total = dicey.rollBoth();
			if(total == 12)
				count++;
		}
		System.out.println("Number of boxcars:\t" + count);		
	}
}