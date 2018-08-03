package co.edureka.lang;

public class WrapperDemo {

	public static void main(String[] args) {
		
		// Demo on Math
		/*System.out.println("SquareRoot of 5 is: "+Math.sqrt(5));
		System.out.println("PI is: "+Math.PI);
		System.out.println("Power is: "+Math.pow(2, 5));
		System.out.println("Sin is: "+Math.sin(30));*/
		
		
		// Wrapper Classes:
		
		// Primitive Type
		int i = 10;
		char ch = 'A';
		double d = 12.23;
		
		// Reference Types: Use Wrapper Classes Instead
		
		// BOXING : Putting the data into an Object
		Integer iRef = new Integer(i); // iRef is a ref var instead of a primitive
		Character cRef = new Character(ch);
		Double dRef = new Double(d);

		// UNBOXING : Extract data from Object
		int j = iRef.intValue();
		char ch1 = cRef.charValue();
		double e = dRef.doubleValue();
	
		// AUTO-BOXING
		Integer xRef = 10; // translated by compiler as -> Integer xRef = new Integer(10); 
		// AUTO-UNBOXING
		int y = xRef; // translated by compiler as -> int y = xRef.intValue();
		
	}

}
