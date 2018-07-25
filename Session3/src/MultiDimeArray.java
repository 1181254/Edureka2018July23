
public class MultiDimeArray {

	public static void main(String[] args) {
		
		// Array of Arrays, Not a Matrix no row column.. Matrices can be represented using Array of Arrays
		// a1 is a reference which points to an array( array further points to so many arrays)
		int[][] a1 = {
						{10,20,30,40,50}, //0
						{10,20,30},       //1
						{10,20,30,40},    //2
						{10,20},          //3
						{10}              //4
					 };
		
		System.out.println("a1 is: "+a1); // Address
		System.out.println("a1 length is: "+a1.length); //5 , a1 holds only 5 arrays
		
		System.out.println("a1[0] is: "+a1[0]);
		System.out.println("a1[0] length is: "+a1[0].length);
		
		System.out.println("a1[3] is: "+a1[3]);
		System.out.println("a1[3] length is: "+a1[3].length);
		
		// a1's 3rd indexed array's oth element
		System.out.println("a1[3][0]: "+a1[3][0]);
		System.out.println("a1[2][2]: "+a1[2][2]); // 30
		
		
		System.out.println("***********************");
		
		// Read All Elements in Array
		// i Loop shall run 5 times !!
		for(int i=0;i<a1.length;i++){
			
			// j loop which runs till the length of array contained in a1
			for(int j=0;j<a1[i].length;j++){
				System.out.print(a1[i][j]+" "); // Prints ith array's jth index	
			}
			
			System.out.println();
		}
		
		// Explore : Enhanced For Loop 
		
		System.out.println("***********************");

		// 3-Dim
		// Array of Array of Arrays
		int[][][] a2 = {
				
							   {
									{10,20,30,40,50}, //0
									{10,20,30},       //1
									{10,20,30,40},    //2 			// 0th
									{10,20},          //3
									{10}              //4
								},
								
								{
									{10,20,30,40,50}, //0 			// 1th
									{10,20,30},       //1
								}
				
					   };
		
		System.out.println("a2 is: "+a2); // address
		System.out.println("a2 length is: "+a2.length); // ?
		
		// If we don't know the data before hand, and would like to substitute the data later
		// we need 3 1-D arrays, with each 1-D Array having 3 elements
		// not a matrix
		int[][] a3 = new int[3][3];
		
		// we need 5 1-D Arrays with size not specified
		int[][] a4  = new int[5][];
		a4[0] = new int[10]; // a4's 0th array can hold 10 elements
		a4[1] = new int[20]; // a4's 0th array can hold 20 elements
		a4[2] = new int[15]; // a4's 0th array can hold 15 elements
		a4[3] = new int[13]; // a4's 0th array can hold 13 elements
		a4[4] = new int[21]; // a4's 0th array can hold 21 elements
		
	}

}
