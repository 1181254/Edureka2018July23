
public class Overloading {

	void area(int side){
		int a = side * side;
		System.out.println("Area of Square with side "+side+" is "+a);
	}
	
	void area(int length, int width){
		int a = length * width;
		System.out.println("Area of Rectangle with length "+length+" and width "+width+" is "+a);
	}
	
	void area(double radius){
		double a = 3.14 * radius * radius;
		System.out.println("Area of Circle with radius "+radius+" is "+a);
	}

	
	void login(int phone){
		// get an OTP and logs in
	}
	
	void login(String username, String password){
		// authenticate and log in
	}
	
	// Rules
	/* 1. Method Name should be Same
	 * 2. Inputs should be Unique i.e. different
	 * 	  2.1 Number of Inputs
	 * 	  2.2 Type of Inputs -> That is Always a Unique Signature
	 * 	  2.3 Sequence of Inputs
	 * 3. Return Type i.e. ack has no impact, No Role to Play
	 */
	
	// Number of Inputs | Increase or Decrease
	void fun(){
		
	}
	
	void fun(int i){
		
	}
	
	void fun(int i, int j){
		
	}
	
	// Type Of Inputs
	void fun(float f){
		
	}
	
	void fun(float f, float g){
		
	}
	
	// Sequence of Inputs
	void fun(int i, float f){
		
	}
	
	void fun(float f, int i){
		
	}
	
	// Dont's
	// 1. Cannot Overload on the basis of return type
	/*void play(){
		
	}
	
	int play(){
		
		return 10;
	}*/
	
	//2. Cannot Overload by changing the name of inputs
	/*void play(int i){
		
	}
	
	void play(int j){
		
	}*/
	
	public static void main(String[] args) {
		
		Overloading overloading = new Overloading();
		overloading.area(12);		// Call of a method is binding definition
		overloading.area(12,15);
		overloading.area(4.56);
		
		// Everytime Calling a Method is Unique
		overloading.fun();
		overloading.fun(10);
		overloading.fun(10,20);
		overloading.fun(10.2f);
		overloading.fun(10.2f, 20.3f);
		overloading.fun(10,2.2f);
		overloading.fun(2.2f,10);
		
		//overloading.play(10);
		
	}

}
