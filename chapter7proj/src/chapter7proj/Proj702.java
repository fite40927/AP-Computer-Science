package chapter7proj;

public class Proj702 {
	public static void main(String[] args) {
		Doctor jbrown = new Doctor("Jerry Brown", 1234, 9500);
		Administrator krye = new Administrator("Kerry Rye", 4321, 8000);
		Surgeon tprett = new Surgeon("Taylor Prett", 3142, 12000);
		Janitor dwertz = new Janitor("Daniel Wertz", 2134, 3000);
		Receptionist ywren = new Receptionist("Yve Wren", 3421, 4500);
		Nurse lorlap = new Nurse("Lauren Orlap", 2341, 5000);
		
		jbrown.giveCheckup();
		krye.meetWithSponsor();
		tprett.removeAppendix();
		lorlap.giveShot();
		
		System.out.println(dwertz.getSalary());
		dwertz.promotion();
		System.out.println(dwertz.getSalary());
		
		ywren.updateHours(45);
		System.out.println(ywren.getOvertime());
	}
}