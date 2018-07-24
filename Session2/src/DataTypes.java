// In java we write our programs in classes
public class DataTypes {

	// main is a method(is a way or a procedure) where instructions written in it, gets executed sequentially
	public static void main(String[] args) {
		
		// byte is the type of data, define the size also
		// age is the name of storage container, many a times we call it a variable. (why variable? -> Value can change)
		// 20 is the data or value or literal. (20 is a constant)
		
		// Writing the data in the storage container
		byte age = 20;
		
		// updating the value in the Storage Container
		age = 30;
		
		// Read the data from Storage Container
		System.out.println("age is: "+age);
		
		// A Single Value Container cannot have more than one value
		//byte johnsAge = 20, 30; // error
		
		byte b = 10;  // 8bits
		short s = 10; // 16bits
		int i = 10;   // 32bits
		long l = 10;  // 64bits
		
		float f = 3.14f;   //32bits
		double d = 100.33; //64bits
		
		//char ch = 'A';
		//char ch = 65; // ASCII Code for Character A
		//char ch = '\u20b9'; // Unicode for Indian Rupee
		char ch = '\u0905';
		System.out.println("ch is: "+ch); // Read Operation
		
		boolean flag = true;
		flag = false;
		
		System.out.println("flag is :"+flag);
	}

}
