
public class Strings {

	public static void main(String[] args) {
		
		// Interned Strings
		String str1 = "Hello";
		String str2 = "Hello";
		
		// Object Way
		String str3 = new String("Hello");
		String str4 = new String("HeLlo");
		
		// str1, str2, str3 and str4 are reference variables !!
		// Shows Value and Not Addresses -> toString(), which gets executed automatically on printing ref variable
		System.out.println("str1 is: "+str1); // -> System.out.println("str1 is: "+str1.toString());
		System.out.println("str2 is: "+str2);
		System.out.println("str3 is: "+str3);
		System.out.println("str4 is: "+str4);
		
		// Proof of Concept : str holds addresses:
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
		
		// equals method compares content i.e. value and not addresses
		// returns true or false
		
		if(str1.equals(str2)){
			System.out.println("str1 equals str2");
		}else{
			System.out.println("str1 not equals str2");
		}
		
		//if(str3.equals(str4)){
		if(str3.equalsIgnoreCase(str4)){
			System.out.println("str3 equals str4");
		}else{
			System.out.println("str3 not equals str4");
		}
		
		//if(str3.compareTo(str4) == 0){
		if(str3.compareToIgnoreCase(str4) == 0){
			System.out.println("str3 compared to str4");
		}else{
			System.out.println("str3 not compared to str4");
		}
		
		

	}

}
