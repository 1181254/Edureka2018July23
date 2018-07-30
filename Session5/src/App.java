
public class App {

	// main is the method which is executed by JVM automatically
	// Execution of Program Begins Here
	public static void main(String[] args) {
		
		// Create Objects Here:
		
		// Object Construction Statement
		// new operator creates an object in the heap at run time.
		// will return back the address where object is created and we store the returned address in uRef1
		
		User uRef1 = new User();
		User uRef2 = new User();
		User uRef3 = uRef1; // Reference Copy
	
		System.out.println("uRef1 is: "+uRef1);
		System.out.println("uRef2 is: "+uRef2);
		System.out.println("uRef3 is: "+uRef3);
		
		// Writing the data in Object
		uRef1.name = "John";
		//uRef1.phone = "+91 99999 88888";
		uRef1.setPhone("+91 99999 88888");
		uRef1.email = "john@example.com";
		uRef3.gender = 'M';
		//uRef3.age = 30;
		uRef3.setAge(30);
		uRef1.address = "Redwood Shores";
		
		uRef2.name = "Jennie";
		//uRef2.phone = "+91 99999 77777";
		uRef2.setPhone("+91 99999 77777");
		uRef2.email = "jennie@example.com";
		uRef2.gender = 'F';
		//uRef2.age = 32;
		uRef2.setAge(32);
		uRef2.address = "Country Homes";
		
		// Reading the Object
		//System.out.println(uRef1.name+" is "+uRef3.age+" years old and lives in "+uRef1.address);
		//System.out.println(uRef2.name+" is "+uRef2.age+" years old and lives in "+uRef2.address);
		System.out.println(uRef1.name+" is "+uRef3.getAge()+" years old and lives in "+uRef1.address);
		System.out.println(uRef2.name+" is "+uRef2.getAge()+" years old and lives in "+uRef2.address);
		
		// Update the Data
		uRef1.name = "John Watson";
		//uRef1.age = 35;
		uRef1.setAge(35);
		System.out.println("----Reading after an update----");
		//System.out.println(uRef1.name+" is "+uRef3.age+" years old and lives in "+uRef1.address);
		System.out.println(uRef1.name+" is "+uRef3.getAge()+" years old and lives in "+uRef1.address);
		
		
		// Property of the Class i.e. which is marked as static, shall be accessed with Class name directly !!
		User.companyName = "ABC International !!";
		User.showCompanyName();
		
		// static can be accessed by objects i.e. through their reference variables.
		// Objects can access property of class !! class cannot access property of Object !!
		// static acts as a common property for all the objects which we create.
		// some sort of global data for all the objects can be marked as static which can be shared amongst them
		
		WhatsApp user1 = new WhatsApp();
		WhatsApp user2 = new WhatsApp();
		
		user1.statusTitle = "Be Exceptional";
		user2.statusTitle = "Work hard Get Luckier";
		
		user1.groupTitle = "Edureka";
		
		System.out.println("StatusTitle for user1 is: "+user1.statusTitle+" GroupTitle for user1 "+user1.groupTitle);
		System.out.println("StatusTitle for user2 is: "+user2.statusTitle+" GroupTitle for user2 "+user2.groupTitle);
		System.out.println("GroupTitle of WhatsApp Class "+WhatsApp.groupTitle);
		
		
		
	}

}
