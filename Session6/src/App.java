
public class App {

	public static void main(String[] args) {
		
		Product pRef1 = new Product(); // Product() -> Represents Execution of Default Constructor
		Product pRef2 = new Product();
		Product pRef3 = new Product();
		
		// Writing the data at the time of object creation -> as a default data
		Product pRef4 = new Product(401,"Adidas Originals Shoe",10000);
		
		// pRef1, pRef2, pRef3 are not objects
		// they are reference variable holding addresses to objects
		
		// Write the Data Directly
		pRef1.pid = 101;
		pRef1.name = "Samsung LED";
		pRef1.price = 50000;

		// Write the data using method of object
		pRef2.setProductDetails(201, "Apple iPhone X", 80000);
		
		// Not writing the data for pRef3
		
		// Read the data using method
		pRef1.showProductDetails();
		pRef2.showProductDetails();
		pRef3.showProductDetails();
		pRef4.showProductDetails();
	}

}
