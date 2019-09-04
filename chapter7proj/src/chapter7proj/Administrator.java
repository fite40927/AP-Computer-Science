package chapter7proj;

public class Administrator extends HospitalEmployee{

	public Administrator(String NAME, int ID, int SAL) {
		super(NAME, ID, SAL);
		// TODO Auto-generated constructor stub
	}

	public void meetWithSponsor() {
		System.out.println("Sponsor met.");
	}
}