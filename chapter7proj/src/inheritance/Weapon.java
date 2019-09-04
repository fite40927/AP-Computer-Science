package inheritance;

public class Weapon extends Item{
	private int lethality, chargeRemaining, MAXCHARGE, weight;
	private String name;
	public Weapon(String thename, int lethalLevel, int theweight) {
		super(thename, theweight);
		if(lethalLevel > 10) lethalLevel = 10; else if(lethalLevel < 0) lethalLevel = 0;
		lethality = lethalLevel;
		MAXCHARGE = 12;
		chargeRemaining = MAXCHARGE;
		name = thename;
		weight = theweight;
	}
	public boolean fire() {
		boolean hit = false;
		if((int)(Math.random()*2) == 1) hit = true;
		chargeRemaining--;
		return hit;
	}
	public boolean reload() {
		chargeRemaining = MAXCHARGE;
		return true;
	}
	public String toString() {
		String id = name + "\tLevel: " + lethality + "\tCharge: " + chargeRemaining;
		return id;
	}
	public int getLethality() {
		return lethality;
	}
	public int getCharge() {
		return chargeRemaining;
	}
	public void changeLethality(int newLethality) {
		lethality = newLethality;
	}
	public void changeChargeCap(int newCharge) {
		MAXCHARGE = newCharge;
		this.reload();
	}
	public void changeCharge(int newCharge) {
		chargeRemaining = newCharge;
	}
}