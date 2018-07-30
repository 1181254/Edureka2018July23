// Structure of an Object
public class Product {
	
	// non static
	int pid;
	String name;
	int price;

	// non static special method with same name as that of class name. it has no return type
	// Constructor
	// Executed the moment we create an object. its the first execution on the object where we give some initial value
	
	// Such a Constructor is created Automatically by compiler
	// Takes no Inputs -> Default Constructor
	/*Product(){
		pid = 0;	 // primitives
		name = null; // reference
		price = 0; 
	}*/
	
	// What initial Value an Object should hold, specify in constructor
	// Default Constructor -> No Inputs
	Product(){
		pid = -1;	 // primitives
		name = "NA"; // reference
		price = 0; 
	}
	
	// Parameterized Constructor -> Has Inputs (Arguments or Parameters)
	Product(int id, String nm, int pr){
		pid = id;	 // primitives
		name = nm; // reference
		price = pr; 
	}
	
	
	// non static
	void setProductDetails(int id, String nm, int pr){
		pid = id;
		name = nm;
		price = pr;
	}
	
	void showProductDetails(){
		System.out.println(pid+" | "+name+" is priced at \u20b9"+price);
	}
}
