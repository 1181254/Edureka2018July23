package co.edureka.model;

public class Child extends Father{ // IS-A Relation

	// Attributes
	int vehicles;
	String compName;
	
	public Child() {
	
	}
	
	public Child(int vehicles, String compName) {
		this.vehicles = vehicles;
		this.compName = compName;
	}
	
	public int getVehicles() {
		return vehicles;
	}
	
	public void setVehicles(int vehicles) {
		this.vehicles = vehicles;
	}
	
	public String getCompName() {
		return compName;
	}
	
	public void setCompName(String compName) {
		this.compName = compName;
	}
	
	@Override
	public String toString() {
		return "Child [fname=" + fname + ", lname=" + lname + ", wealth=" + wealth +", vehicles=" + vehicles + ", compName=" + compName + "]";
	}
	
}
