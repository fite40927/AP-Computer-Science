package inheritance;

import java.util.ArrayList;

public class Character {
	private int health, MAXHEALTH;
	private String name;
	private ArrayList<Item> backpack = new ArrayList<Item>();
	private Weapon fist, foot;
	private boolean status;
	public Character(String thename){
		name = thename;
		MAXHEALTH = 100;
		health = MAXHEALTH;
		status = true;
		
		fist = new Weapon("punch", 2, 0);
		foot = new Weapon("kick", 3, 0);
		
		backpack.add(fist);
		backpack.add(foot);
	}
	public void pickup(Item item) {
		if(this.getWeight() + item.getWeight() <= 100) {
			backpack.add(item);
			System.out.println(this.getName() + " has picked up " + item.getName());
		}
		else System.out.println(this.getName() + " is not strong like bull. Cannot carry " + item.getName() + " in pack.");
	}
	public  String  fight(Character target, Weapon useThis) {
		String x = this.getName() + " has missed " + target.getName();
		System.out.println(this.getName() + " uses " + useThis.getName());
		if(useThis.fire()) {
			x = target.takeDamage(useThis);
		}
		System.out.println(x);
		return x;
	}
	public  String  fight(Character target) {
		String str = this.getName() + " has missed " + target.getName();
		if(backpack.get(backpack.size()-1) instanceof Weapon) {
			Weapon w  = (Weapon) backpack.get(backpack.size()-1);
			System.out.println(this.getName() + " uses " + w.getName());
			if(w.fire()) str = target.takeDamage(w);
		}
		else System.out.println(this.getName() + " does not have a weapon in his hand");
		System.out.println(str);
		
		return str;
	}
	public String panic(Character target) {
		boolean hit = false; 
		while(target.status) {
			for(int i = 0; i < backpack.size()-1; i++) {
				if(target.getHealth() <= 0) break;
				String ret = this.getName() + " has missed " + target.getName();
				if(backpack.get(i) instanceof Weapon) {
					Weapon w = (Weapon) backpack.get(i);
					System.out.println(this.getName() + " uses " + w.getName());
					if(w.fire()) ret = target.takeDamage(w);
					System.out.println(ret);
				}
				else System.out.println(this.getName() + ", in his panic, did not grab a weapon"); 
			}
		}
		return this.getName() + " has panicked";
	}
	public int getWeight() {
		int packWeight = 0;
		for(int i = 0; i < backpack.size(); i++)
			packWeight+=backpack.get(i).getWeight();
		return packWeight;
	}
	public String getName() {
		return name;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int newHealth) {
		health = newHealth;
	}
	public void setMaxHealth(int newHealth) {
		MAXHEALTH = newHealth;
	}
	public String takeDamage(Weapon inflictor) {
		String x = this.getName();
		int damage = inflictor.getLethality()*10;
		int taken = this.getHealth() - damage;
		
		if(taken < 0) taken = 0;
		this.setHealth(taken);
		x += " has taken " + damage + " damage";
		
		if(this.getHealth() == 0) x += "\n" + this.getName() + " has died";
		else x += "\n" + this.getName() + " now has " + this.getHealth() + " hp remaining";
		
		return x;
	}
	public void setStatus(boolean x) {
		status = x;
	}
}
