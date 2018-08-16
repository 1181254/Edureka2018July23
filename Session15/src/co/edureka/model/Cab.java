package co.edureka.model;

import java.util.List;

public class Cab {

	int regNumber;
	String name;
	String color;
	
	Driver driver; 				 // Has-A Relationship | 1 to 1
	
	List<String> passengerNames; // Has-A Relationship | 1 to many

	public Cab(){
		
	}
	
	// Constructor Based Injection
	public Cab(Driver driver){
		System.out.println("==Constructor Injection=="); 
		this.driver = driver;
	}
	
	public Cab(int regNumber, String name, String color, Driver driver) {
		this.regNumber = regNumber;
		this.name = name;
		this.color = color;
		this.driver = driver;
	}

	public int getRegNumber() {
		return regNumber;
	}

	public void setRegNumber(int regNumber) {
		this.regNumber = regNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Driver getDriver() {
		return driver;
	}

	// Setter Based Injection
	public void setDriver(Driver driver) {
		System.out.println("==Setter Injection==");
		this.driver = driver;
	}

	public List<String> getPassengerNames() {
		System.out.println("==List Setter Injection==");
		return passengerNames;
	}

	public void setPassengerNames(List<String> passengerNames) {
		this.passengerNames = passengerNames;
	}

	@Override
	public String toString() {
		return "Cab [regNumber=" + regNumber + ", name=" + name + ", color=" + color + ", driver=" + driver + "]";
	}
	
}
