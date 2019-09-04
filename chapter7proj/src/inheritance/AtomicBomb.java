package inheritance;

public class AtomicBomb extends Weapon {

	public AtomicBomb() {
		super("Atomic Bomb", 10, 50);
		// TODO Auto-generated constructor stub
	}
	public boolean fire() {
		boolean canFire = false;
		if(this.getCharge() > 0) canFire = true;
		if(canFire)
			this.changeCharge(this.getCharge()-1);
		return canFire;
	}
}