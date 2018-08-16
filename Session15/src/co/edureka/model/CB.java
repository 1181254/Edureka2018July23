package co.edureka.model;

import org.springframework.beans.factory.annotation.Autowired;

public class CB {

	CA ca; // Has-A Relationship
	
	public CB(){
		
	}
	
	@Autowired
	public CB(CA ca){
		this.ca = ca;
	}

	public CA getCa() {
		return ca;
	}

	public void setCa(CA ca) {
		this.ca = ca;
	}
	
}
