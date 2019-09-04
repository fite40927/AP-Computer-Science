package chapter7proj;

public class Janitor extends HospitalEmployee {
	public Janitor(String NAME, int ID, int SAL) {
		super(NAME, ID, SAL);
		// TODO Auto-generated constructor stub
	}

	public void mopRoom() {
		System.out.println("Room mopped.");
	}
}
