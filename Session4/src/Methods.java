// Scanner will help to read data from User
import java.util.Scanner; // java package(folder) contains util folder and util folder contains Scanner.class
//import java.lang.*; // default package in java


class Area{
	
	// Non Static -> They will be executed with an Object
	// void -> So not ack i.e. return
	void calAreaOfRect(int l, int w){
		
		l = mtrsToCms(l);
		w = mtrsToCms(w);
		
		int a = l * w;
		System.out.println("Area of rectanle with length "+l+" and width "+w+" is "+a);
		
		
		
	}
	
	// double -> ack i.e. return back a double and that too in the end
	double calAreaOfCircle(double r){
		double a = 3.14 * r * r;
		return a; // last statement
	}
	
	// Static Method -> They will be executed with Class Name 
	static int mtrsToCms(int mtrs){
		int cms = mtrs*100;
		return cms;
	}
}


public class Methods {
	
	// Non Static -> They will be executed with an Object
	boolean isInternetConnected(int setting){
		
		if(setting == 3)
			return true;
		else 
			return false;
	}
	
	
	// Static Method -> They will be executed with Class Name 
	static void sayHello(){
		System.out.println("This is hello from static method !!");
	}

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); // Reading from Console
	
		Area area = new Area(); 	// Object Construction Statement
		
		System.out.println("Please Enter Length:");
		int l = scanner.nextInt();
		
		System.out.println("Please Enter Width:");
		int w = scanner.nextInt();
		
		area.calAreaOfRect(l, w); // calling a method or executing a method with object as it is non static
		area.calAreaOfRect(25, 9);
		
		System.out.println("Enter Radius");
		double r = scanner.nextDouble();
		double result = area.calAreaOfCircle(r);
		System.out.println("Area of Circle is: "+result);
		
		Methods m = new Methods(); // Object Construction Statement
		
		if(m.isInternetConnected(3)){
			System.out.println("You can browse internet");
		}
		
		int cms = Area.mtrsToCms(147); // calling a method or executing a method with class name as it is static
		System.out.println("cms is: "+cms);
		
		Methods.sayHello();
		// Why Without Class Name ??
		sayHello(); // sayHello without class name -> Because sayHello and main belongs to same class i.e. Methods and both are static
	}

}

