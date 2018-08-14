package co.edureka.model;

public class TV extends Product{ // IS-A Relation

	int screenSize;
	
	public TV() {
	
	}

	public TV(int screenSize) {
		this.screenSize = screenSize;
	}

	public int getScreenSize() {
		return screenSize;
	}

	public void setScreenSize(int screenSize) {
		this.screenSize = screenSize;
	}

	@Override
	public String toString() {
		return "TV [screenSize=" + screenSize + "]";
	}
}
