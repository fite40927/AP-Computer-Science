package inheritance;

public class Item {
	private int weight;
	private String name;
	public Item(String thename, int theweight) {
		weight=theweight;
		name=thename;
	}
	public int getWeight() {
		return weight;
	}
	public String getName() {
		return name;
	}
	public boolean fire() {
		// TODO Auto-generated method stub
		return false;
	}
}
