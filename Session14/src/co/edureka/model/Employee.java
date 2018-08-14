package co.edureka.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

// Model or Bean or POJO(Plain Old Java Object)

@Entity
@Table(name = "EDU_EMPLOYEE")
public class Employee {

	// Attributes : Pure OOPS
	
	@Id @GeneratedValue
	@Column(name="ID")
	Integer id; 
	
	@Column(name="NAME")
	String name;
	
	@Column(name="EMAIL")
	String email;
	
	@Column(name="SALARY")
	Integer salary;
	
	@Column(name="DESIGNATION")
	String designation;
	
	public Employee() {
	
	}

	public Employee(Integer id, String name, String email, Integer salary, String designation) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.salary = salary;
		this.designation = designation;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", salary=" + salary + ", designation="
				+ designation + "]";
	}
}
