package chapter7proj;

public class Nurse extends HospitalEmployee{

	public Nurse(String NAME, int ID, int SAL) {
		super(NAME, ID, SAL);
		// TODO Auto-generated constructor stub
	}
	public void giveShot() {
		System.out.println("Shot given.");
	}
	public void drawBlood() {
		System.out.println("Blood drawn.");
	}
}
