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
	
	// Methods
	// Belongs to Objects and Not to Class !!
	
	// Setter Methods -> Performs write and update operation
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
	
}
