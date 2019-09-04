package chapter5proj;

//5.4

interface Complexity{
	void setComplexity(int complexity);
	int getComplexity();
}

public class Task2 implements Priority, Complexity {
	public int myPriority;
	private int complexityLevel;
	
	public Task2() {
		myPriority = -1;
		complexityLevel = -1;
	}
	public void setPriority(int a) {
		myPriority = a;
	}
	public int getPriority() {
		return myPriority;
	}
	
	public void setComplexity(int b) {
		complexityLevel = b;
	}
	public int getComplexity() {
		return complexityLevel;
	}
	
	public static void main(String[] args) {
		Task2 one = new Task2();
		Task2 two = new Task2();
		Task2 three = new Task2();
		
		one.setPriority(3);
		two.setPriority(1);
		three.setPriority(2);
		
		one.setComplexity(1);
		two.setComplexity(2);
		three.setComplexity(3);
		
		
		System.out.println(one.getPriority());
		System.out.println(two.getPriority());
		System.out.println(three.getPriority());
		
		System.out.println(one.getComplexity());
		System.out.println(two.getComplexity());
		System.out.println(three.getComplexity());
	}
}