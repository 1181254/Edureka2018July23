package co.edureka.model;

public class LEDTV extends TV{ // IS-A Relation

	String type;
	
	public LEDTV(){
		
	}

	public LEDTV(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "LEDTV [type=" + type + "]";
	}
	
}
