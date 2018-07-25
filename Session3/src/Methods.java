public class Methods {
	
	// Method or Function
	
	// Non Static
	void addNums(int a, int b){
		int c = a+b;
		System.out.println("sum of "+a+" and "+b+" is: "+c);
	}
	
	// Static
	static void addNumsAgain(int a, int b){
		int c = a+b;
		System.out.println("sum of "+a+" and "+b+" is: "+c);
	}

	public static void main(String[] args) {
		
		/*int a = 10;
		int b = 20;
		
		int c = a+b;
		System.out.println("sum of "+a+" and "+b+" is: "+c);
		
		a = 37;
		b = 45;

		c = a+b;
		System.out.println("sum of "+a+" and "+b+" is: "+c);*/
		
		// For a non static method we need object to execute it
		Methods m = new Methods(); // Object Construction Statement
		m.addNums(10, 20);
		m.addNums(37, 45);
		m.addNums(12, 19);
		m.addNums(45, 14);
		m.addNums(56, 78);
		
		
		// For a static method we need to have the class name to execute it, not an object
		Methods.addNumsAgain(100, 200);
		Methods.addNumsAgain(200, 400);

	}

}
