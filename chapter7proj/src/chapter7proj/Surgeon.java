package chapter7proj;

public class Surgeon extends HospitalEmployee {
	public Surgeon(String NAME, int ID, int SAL) {
		super(NAME, ID, SAL);
		// TODO Auto-generated constructor stub
	}

	public void removeAppendix() {
		System.out.println("Appendix removed.");
	}
}