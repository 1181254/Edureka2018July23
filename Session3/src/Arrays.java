
public class Arrays {

	public static void main(String[] args) {
		
		// Implicit Way
		int[] a1 = {10,20,30,40,50}; // Gets Translated during Compilation as int[] a1 = new int[]{10,20,30,40,50};
		
		// Explicit Way
		int[] a2 = new int[]{10,20,30,40,50};
		// new is suppose to create an Array at Run Time i.e. When Program will execute memory will be allocated only at that time.
		// new creates array and returns address back to reference variable
		
		int a3[] = {10,20,30,40,50};
		int a4[] = new int[]{10,20,30,40,50}; // Size is calculated automatically, do not mention it
		
		// Creating an Array by giving no values
		// We only define the Size. Elements are written later and by default all the elements are 0
		// Create Array with Size. Size is Mandatory. We can now write the data anytime we want in future.
		int[] a5 = new int[10];
		
		// a6 and a7 in case of bracke before are reference variables which shall pint to array
		int[] a6,a7;
		a6 = new int[5];
		a7 = new int[10];
		
		// a8 is an array but a9 is a normal integer variable
		int a8[], a9;
		a8 = new int[5]; // array
		a9 = 100; // Normal integer variable
		
		a5[0] = 10;
		a5[4] = 100;
		a5[9] = 1000;
		
		for(int num : a5){
			System.out.print(num+"  ");
		}
		System.out.println();

		char[] chArr = {'H','E','L','L','O'}; 
		for(char ch : chArr){
			System.out.print(ch+"  ");
		}
		System.out.println();
		System.out.println(chArr[2]);  // L
		
		//System.out.println(chArr[20]); // Error at Runtime i.e. an Exception
	}

}
