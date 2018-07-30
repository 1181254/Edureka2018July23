class AmazonProduct{
	
	// non static - Object's Property
	int pid;
	String name;
	int price;
	
	// static -> Class's Property
	static String color;

	// Gets executed when the object is created in the memory
	// this is the first thing which will happen on Object after construction
	AmazonProduct() {
		System.out.println("==AmazonProduct Object Created==");
		pid = 0;
		name = "NA";
		price = 0;
	}
	
	void showProductDetails(){
		System.out.println(pid+"  |  "+name+" is priced at "+price);
	}
	
	static void showColor(){
		System.out.println("Product's color is: "+color);
	}
}

class TV extends AmazonProduct{ // -> Object to Object and Class to Class
	
	int screenSize;
	String brand;
	String type;
	
	TV(){
		System.out.println("==TV Object Created==");
	}
	
	// we can even take data as input to the method
	void setTVDetails(){
		pid = 101;
		name = "Samsung QLED TV";
		price = 80000;
		screenSize = 50;
		brand = "Samsung";
		type = "QLED";
	}
	
	/*void showTVDetails(){
		showProductDetails(); // Inherited and we are executing the same
		System.out.println(type+" TV from "+brand+" has a screen size of "+screenSize+" inches");
	}*/
	
	// Method Overriding : Re-Defining the Parent's Method in the Child | Object to Object
	// When we do not want the definition of the Parent method. We wish to customize the way we want
	void showProductDetails(){
		System.out.println("Product ID: "+pid+"\nDescription: "+type+" TV from "+brand+" has a screen size of "+screenSize+" inches\nPrice: \u20b9"+price);
	}
	
	// Method Hiding : Re-Defining the Parent's Method in the Child | Class to Class
	static void showColor(){
		System.out.println("TV's color is: "+color);
	}
	
}

class Phone extends AmazonProduct{
	
	Phone(){
		System.out.println("==Phone Object Created==");
	}
	
}


public class Inheritance {

	public static void main(String[] args) {
		
		// We are requesting for the Object of TV
		// Rule of Inheritance : Before the construction of Child Object, Parent Object will be created and then the Child Object
		// Constructors are NOT INHERITED !!
		// Anything marked as private is NOT INHERITED !!
		// Attributes and Methods are Inherited 
		/*TV tRef = new TV();
		
		System.out.println("*************");
		
		Phone pRef = new Phone();
		
		tRef.showProductDetails();
		pRef.showProductDetails();*/
		
		TV tRef = new TV();
		tRef.setTVDetails();
		//tRef.showTVDetails();;
		
		//TV.color = "Black";
		//System.out.println("TV Color is: "+TV.color);
		//TV.showColor();
		
		tRef.showProductDetails();
	}

}
