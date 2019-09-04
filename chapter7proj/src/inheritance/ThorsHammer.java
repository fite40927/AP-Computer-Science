package inheritance;

public class ThorsHammer extends Weapon {
	public ThorsHammer(String name, int lethalLevel, int theweight) {
		super(name, lethalLevel, theweight);
		// TODO Auto-generated constructor stub
	}
	public boolean fire() {
		boolean canFire = false;
		if(Driver.wielder.equalsIgnoreCase("Thorgrin") || Driver.wielder.equalsIgnoreCase("Thor")) 
			canFire = true;
		if(canFire) this.changeCharge(this.getCharge()-1);
		return canFire;
	}
	
}