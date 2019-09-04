package chapter5proj;

//5.3

interface Priority{
	public void setPriority(int j);
	public int getPriority();
}

public class Task implements Priority {
	public int myPriority;
	
	public Task() {
		myPriority = -1;
	}
	public void setPriority(int a) {
		myPriority = a;
	}
	public int getPriority() {
		return myPriority;
	}
	
	public static void main(String[] args) {
		Task one = new Task();
		Task two = new Task();
		Task three = new Task();
		
		one.setPriority(3);
		two.setPriority(1);
		three.setPriority(2);
		
		System.out.println(one.getPriority());
		System.out.println(two.getPriority());
		System.out.println(three.getPriority());
	}
}