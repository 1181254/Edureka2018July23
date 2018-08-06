package co.edureka.collections;

class Outer{
	
	void show(){
		System.out.println("This is show of Outer");
	}
	
	// Nested Class or Inner Class
	// Object in an Object : Containment
	class Inner{
		void show(){
			System.out.println("This is show of Inner");
		}
	}
}

// Real time Use Case
class UI{
	
	// help to fetch the data to be displayed on UI
	class Helper{
		
	}
	
}

public class NestedDemo {

	public static void main(String[] args) {
		
		Outer oRef = new Outer();
		Outer.Inner iRef = oRef.new Inner();
				
		oRef.show();
		iRef.show();
	}

}
