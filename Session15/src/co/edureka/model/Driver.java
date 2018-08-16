package co.edureka.model;

public class Driver {
	
	String name;
	int age;
	String drivingLicNum;
	
	public Driver() {
	
	}
	
	public Driver(String name, int age, String drivingLicNum) {
		this.name = name;
		this.age = age;
		this.drivingLicNum = drivingLicNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDrivingLicNum() {
		return drivingLicNum;
	}

	public void setDrivingLicNum(String drivingLicNum) {
		this.drivingLicNum = drivingLicNum;
	}


	@Override
	public String toString() {
		return "Driver [name=" + name + ", age=" + age + ", drivingLicNum=" + drivingLicNum + "]";
	}
	
}
