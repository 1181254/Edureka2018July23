
public class StringAPIs {

	public static void main(String[] args) {
		
		// 10 is immmutable.
		int i = 10;
		
		// Strings are IMMUTABLE i.e. they cannot be changed. A String Literal is just a constant. we cannot modify it.
		String str1 = "John, Jennie, Jim, Jack, Joe";
		//str1.toUpperCase();
		//System.out.println("str1 is: "+str1);
		
		// Any String Operation which manipulates the String will result into a new String and no changes shall happen in the old String
		String str2 = str1.toUpperCase();
		System.out.println("str1 is: "+str1);
		System.out.println("str2 is: "+str2);

		//String str3 = str1.concat(", Fionna, George, Harry");
		String str3 = str1 + ", Fionna, George, Harry";
		System.out.println("str1 is: "+str1);
		System.out.println("str3 is: "+str3);
		
		//str1 = str1.toLowerCase(); // Doeable but a bad practice.
		
		String[] strArr = str1.split(",");
		for(String str : strArr){
			System.out.println(str.trim());
		}
		
		//String str4 = str1.substring(5);
		String str4 = str1.substring(5,10);
		System.out.println("str4 is: "+str4);
		
		int idx = str1.indexOf('o'); // where 1st o appears in the String
		System.out.println("idx is: "+idx);
		idx = str1.lastIndexOf('o'); // where last o appears in the String
		System.out.println("idx is: "+idx);
		
		idx = str1.indexOf("Jennie"); // lastIndexOf
		System.out.println("Index of Jennie is: "+idx);
		
		int len = str1.length();
		System.out.println("Length of str1 is: "+len);
		
		char[] chArr = str1.toCharArray();
		int count = 0;
		for(char ch : chArr){
			if(ch == 'J')
				count++;
			System.out.print(ch+" ");
		}
		System.out.println();
		System.out.println("J's found: "+count);
		
		if(str1.contains("Jack")){
			System.out.println("Jack is in the String");
		}
		
		if(str1.startsWith("Joh")){ // endsWith
			System.out.println("str1 starts with Joh");
		}
		
		String email = "john@example.com";
		String password = "pass";
		if(email.contains("@") && email.endsWith(".com")){
			System.out.println(email+" is correctly written !!");
		}else{
			System.out.println("Invalid Email !!");
		}
			
		if(password.length() >=6){
			System.out.println("Password Accepted");
		}else{
			System.out.println("Min 6 Characters Needed !!");
		}
		
		String str6 = str1.replace('J', 'K');
		System.out.println(str6);
	}

}
