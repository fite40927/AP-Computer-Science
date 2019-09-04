package chapter7proj;

public class Doctor extends HospitalEmployee {
	public Doctor(String NAME, int ID, int SAL) {
		super(NAME, ID, SAL);
		// TODO Auto-generated constructor stub
	}

	public void giveCheckup() {
		System.out.println("Checkup given.");
	}
}
