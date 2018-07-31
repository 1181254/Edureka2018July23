import java.util.Scanner;

/*class Cab{
	
	Cab(){
		System.out.println("==Cab Object Created==");
	}
	
	void bookCab(){
		System.out.println("Cab Booked !! Arriving Soon !!");
	}
	
	void hello(){
		System.out.println("Hello from Cab");
	}
}*/

// We cannot create objects of abstract class. As a rule of inheritance parent object is created first and then child object.
// So RTE i.e. JVM shall create parent object and then the child object
// This prroves that inheritance is happening from Object to Object
// it can have abstract as well as normal methods
// We are trying to optimize Run Time Polymorphism
/*abstract class Cab{
	
	Cab(){
		System.out.println("==Cab Object Created==");
	}
	
	// abstract method has no definition.
	// it can only be create in abstract class.
	// >>>>> it acts as a rule created by parent !! >>>>>
	abstract void bookCab();
	// if thr are multiple abstract methods, we need to override all of them in child
	
	void hello(){
		System.out.println("This is a normal hello !!");
	}
}*/

//We are trying to optimize Run Time Polymorphism to the best
interface Cab{
	
	// interfaces cannot have constructors.
	// it means that neither we nor RTE can create the object of interface.
	// interfaces has no objects and hence no object to object inheritance.
	/*Cab(){
		System.out.println("==Cab Object Created==");
	}*/
	
	// This is a Rule, which must be defined by the object implementing this interface
	void bookCab(); // -> public abstract void bookCab();
	
	// interfaces cannot have method definitions
	/*void hello(){
		System.out.println("This is a normal hello !!");
	}*/
}

// extends Cab is not possible as thr is no object to object inheritance anymore !!
// we now do implements rather than extends
class UberGo implements Cab{ //extends Cab{
	
	UberGo(){
		System.out.println("==UberGo Object Created==");
	}
	
	// Overriding -> ReDefining the bookCab method of Parent Object in Child Object
	public void bookCab(){
		System.out.println("UberGo Booked !! Arriving Soon !!");
	}
	
	/*void calculateFare(){
		System.out.println("Fare is \u20b9 175");
	}*/
}

class UberX implements Cab{ //extends Cab{
	
	UberX(){
		System.out.println("==UberX Object Created==");
	}
	
	// Overriding -> ReDefining the bookCab method of Parent Object in Child Object
	public void bookCab(){
		System.out.println("UberX Booked !! Arriving Soon !!");
	}
}

class UberMoto implements Cab{ //extends Cab{
	
	UberMoto(){
		System.out.println("==UberMoto Object Created==");
	}
	
	// Overriding -> ReDefining the bookCab method of Parent Object in Child Object
	public void bookCab(){
		System.out.println("UberMoto Booked !! Arriving Soon !!");
	}
}

public class RTP {

	public static void main(String[] args) {
		
		//UberGo go = new UberGo();
		//go.bookCab();
		
		//Polymorphic Statement
		//Parent's Reference Variable can point to the object of Child, but vice versa isnt possible
		//Cab c = new UberGo();
		// since UberGo overrides bookCab method it is possible to execute it with Cab's Ref Var
		//c.bookCab(); // it seems bookCab of Cab shall be executed as ref var is of Cab. But overriding will still exist.
		
		// Since calculateFare isnt thr in Cab and but obvious not overrided in UberGo
		// c.calculateFare(); // err -> not possible
		
		// Accessible
		//c.hello();
		
		// RUN TIME POLYMORPHISM
		// existing in more than one form
		
		// c as ref var can point to many objects eg: UberGo, UberX and UberMoto (as in Child)
		// same method call i.e. c.bookCab is executing diff definitions
		
		/*Cab c;
		c = new UberGo();
		System.out.println("c is: "+c);
		c.bookCab();
		
		System.out.println("****************");
		
		c = new UberX();
		System.out.println("c is: "+c);
		c.bookCab();
		
		System.out.println("****************");
		
		c = new UberMoto();
		System.out.println("c is: "+c);
		c.bookCab();*/
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Which Cab you wish to Book ?");
		System.out.println("1 for UberGo");
		System.out.println("2 for UberX");
		System.out.println("3 for UberMoto");
		
		int typeOfCab = scanner.nextInt();
		
		Cab c;
		
		if(typeOfCab == 1){
			c = new UberGo();
		}else if(typeOfCab == 2){
			c = new UberX();
		}else{
			c = new UberMoto();
		}
		
		c.bookCab();
		
		// Creating Cab Object or executing bookCab on Cab Object is no benefit!!
		// As we are focusing on UberGo UberX and UberMoto
		//c = new Cab();
		//c.bookCab();
		
		// Restricted now !!
		//c = new Cab(); // error now -> since Cab is abstract and we cannot create its objects
	}

}
