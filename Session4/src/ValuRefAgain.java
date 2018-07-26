
public class ValuRefAgain {

	public static void main(String[] args) {
		
		int a1 = 100;
		System.out.println("a1 is: "+a1); // 100 

		int[] a2 = {10,20,30,40,50};
		System.out.println("a2 is: "+a2); // address
		
		// a1 is a variable
		// a2 is a reference variable
		
		int a3 = a1; // Value Copy
		
		System.out.println("a3 is: "+a3);
		a3 = 20;
		System.out.println("a3 is: "+a3);
		System.out.println("a1 is: "+a1);
		
		int[] a4 = a2; // Reference Copy
		System.out.println("a4 is: "+a4);
		
		System.out.println("a2[0] is: "+a2[0]);
		System.out.println("a4[0] is: "+a4[0]);
		
		a4[2] = 123;
		
		System.out.println("a2[2] is: "+a2[2]);
		System.out.println("a4[2] is: "+a4[2]);
		
	}

}
