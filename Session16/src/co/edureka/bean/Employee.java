package co.edureka.bean;

public class Employee {
	
	// Attributes
	int eid;
	String name;
	int salary;
	String dept;
	String desig;

	public Employee() {
	
	}

	public Employee(int eid, String name, int salary, String dept, String desig) {
		this.eid = eid;
		this.name = name;
		this.salary = salary;
		this.dept = dept;
		this.desig = desig;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getDesig() {
		return desig;
	}

	public void setDesig(String desig) {
		this.desig = desig;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", salary=" + salary + ", dept=" + dept + ", desig=" + desig
				+ "]";
	}
	
	// Business Method
	// Advices will be executed before and after the execution of this business method
	public void allocateSeat(int exp, String competency){
		System.out.println("*********Allocating Seat**********");
		if(competency.equals("AWS") && exp >=5){
			System.out.println(name+" is allocated seat 101 on floor 5");
			desig = "Manager";
		}
		
		if(competency.equals("Java") && exp == 3){
			System.out.println(name+" is allocated seat 303 on floor 7");
			desig = "Sr. Engineer";
		}
		System.out.println("*********Seat Allocated**********");
	}
	
}
