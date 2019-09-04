package chapter7proj;

public class HospitalEmployee {
	public String name;
	public int salary;
	public int id;
	public int wklyHours;
	
	public HospitalEmployee(String NAME, int ID, int SAL) {
		name = NAME;
		salary = 5000;
		id = ID;
	}
	public void updateHours(int moreHours) {
		wklyHours += moreHours;
	}
	public int promotion() {
		salary += 500;
		return salary;
	}
	public int getSalary() {
		return salary;
	}
	public int getID() {
		return id;
	}
	public int getOvertime() {
		int ovt = wklyHours - 40;
		return ovt;
	}
	public int getWklyHourse() {
		return wklyHours;
	}
	public void newWeek() {
		wklyHours = 0;
	}
}