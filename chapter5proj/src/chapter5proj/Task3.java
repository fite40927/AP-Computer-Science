package chapter5proj;

//5.5

public class Task3 implements Priority, Complexity, Comparable {
	public int myPriority;
	private int complexityLevel;
	public String title;
	
	public Task3(String name) {
		myPriority = -1;
		complexityLevel = -1;
		title = name;
	}
	public void setPriority(int a) {
		myPriority = a;
	}
	public int getPriority() {
		return myPriority;
	}
	public String getName() {
		return title;
	}
	
	public void setComplexity(int b) {
		complexityLevel = b;
	}
	public int getComplexity() {
		return complexityLevel;
	}
	
	public int compareTo(Object obj) { //returns 1 if greater priority (smaller #)
		int objPriority = ((Task3)obj).getPriority();
		if(myPriority < objPriority)
			return myPriority;
		else 
			return objPriority;
	}
	
	public static void main(String[] args) {
		Task3 one = new Task3("one");
		Task3 two = new Task3("two");
		Task3 placeholder = new Task3(null);
		
		one.setPriority(1);
		two.setPriority(4);
		
		placeholder = two;
		
		if(one.compareTo(two) == one.getPriority())
			System.out.println(one.getPriority() + ". " + one.getName());
		else {
			System.out.println(two.getPriority() + ". " + two.getName());
			placeholder = one;
		}
			
		
		System.out.println(placeholder.getPriority() + ". " + placeholder.getName());
	}
}