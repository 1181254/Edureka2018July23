// Textual Representation how an object will look like in the memory
// what the object will have in it, as in a BOX
public class User {
	
	// Attributes or Data Members or State of an Object
	// Below Attributes they do not belong to Class, They Belong to Object !!
	String name;
	private String phone;
	String email;
	char gender;
	private int age;
	String address;
	
	// Attributes or Data Members or State of Class
	// Below Attributes belongs to Class, They Do Not Belong to Object !!
	static String companyName;
	
	// Methods
	// Belongs to Objects and Not to Class !!
	
	// Setter Methods -> Performs write and update operation
	// needed to access private data !!
	void setPhone(String ph){
		phone = ph;
	}
	
	void setAge(int a){
		age = a;
	}
	
	// Getter Methods -> Reads the data and returns back the data
	String getPhone(){
		return phone;
	}
	
	int getAge(){
		return age;
	}
	
	// Method
	// Belongs to Class and Not to Object !!
	static void showCompanyName(){
		System.out.println("Company Name is: "+companyName);
	}
	
}
