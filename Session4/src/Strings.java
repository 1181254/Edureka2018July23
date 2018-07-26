
public class Strings {

	public static void main(String[] args) {
		
		// Single Value Container | Primitives
		char ch = 'A';
		
		// Multi value Container  | Reference
		
		// Interned Way
		String str1 = "Hello";
		String str2 = "Hello";
		
		// Object Way
		String str3 = new String("Hello");
		String str4 = new String("Hello");
		
		// str1, str2, str3, str4 are Reference Variables
		// Reference Variable holds Addresses
		
		// Here, below instead of printing addresses, values are printed

		System.out.println("==Strings without toString() method Call==");
		System.out.println("str1 is: "+str1);  // Converted to -> System.out.println("str1 is: "+str1.toString()); by compiler
		System.out.println("str2 is: "+str2);
		System.out.println("str3 is: "+str3);
		System.out.println("str4 is: "+str4);
		
		System.out.println();
		
		System.out.println("==Strings with toString() method Call==");
		System.out.println("str1 is: "+str1.toString()); 
		System.out.println("str2 is: "+str2.toString());
		System.out.println("str3 is: "+str3.toString());
		System.out.println("str4 is: "+str4.toString());
		
		if(str1 == str2){
			System.out.println("str1 == str2");
		}else{
			System.out.println("str1 != str2");
		}
		
		if(str3 == str4){
			System.out.println("str3 == str4");
		}else{
			System.out.println("str3 != str4");
		}
		

	}

}
