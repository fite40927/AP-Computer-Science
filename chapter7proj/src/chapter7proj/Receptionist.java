package chapter7proj;

public class Receptionist extends HospitalEmployee{
	public Receptionist(String NAME, int ID, int SAL) {
		super(NAME, ID, SAL);
		// TODO Auto-generated constructor stub
	}

	public void checkInPatient() {
		System.out.println("Patient checkedIn.");
	}
	public void scheduleAppointment() {
		System.out.println("Appointment scheduled.");
	}
}
