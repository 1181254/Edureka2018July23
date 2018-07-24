
public class Loops {

	public static void main(String[] args) {
		
		/*int num = 9;
		int i = 1;
		
		System.out.println(num+" "+i+"'s are "+(num*i));
		i++; // i is 2 now
		System.out.println(num+" "+i+"'s are "+(num*i));
		i++; // i is 3 now
		System.out.println(num+" "+i+"'s are "+(num*i));
		i++; // i is 4 now
		System.out.println(num+" "+i+"'s are "+(num*i));
		i++; // i is 5 now
		System.out.println(num+" "+i+"'s are "+(num*i));
		i++; // i is 6 now
		System.out.println(num+" "+i+"'s are "+(num*i));
		i++; // i is 7 now
		System.out.println(num+" "+i+"'s are "+(num*i));
		i++; // i is 8 now
		System.out.println(num+" "+i+"'s are "+(num*i));
		i++; // i is 9 now
		System.out.println(num+" "+i+"'s are "+(num*i));
		i++; // i is 10 now
		System.out.println(num+" "+i+"'s are "+(num*i));*/
		
		/*int num = 5;
		for(int i=1; i<=10; i++){
			System.out.println(num+" "+i+"'s are "+(num*i));
		}*/
		
		// for multiple instruction we need a block i.e. start:{    end:}
		/*for(int num=5, i=1; i<=10; i++){
			System.out.println(num+" "+i+"'s are "+(num*i));
		}*/
		
		// works if loop has to execute only 1 single instruction
		System.out.println("-------for loop------");
		for(int num=5, threshold=10, i=1; i<=threshold; i++)
			System.out.println(num+" "+i+"'s are "+(num*i));
		
		System.out.println("-------while loop------");
		
		int num = 7;
		int i = 100;
		int limit = 10;
		
		while(i<=limit){ // condition is checked in the beginning
			System.out.println(num+" "+i+"'s are "+(num*i));
			i++; // evaluate expression to process the loop - within the body itself
		}
		
	
		System.out.println("-------do while loop------");
		num = 9;
		i = 100;
		
		// works minimum once even condition is failed
		do{
			System.out.println(num+" "+i+"'s are "+(num*i));
			i++; 
		}while(i<=limit); // condition checking is in the end

		System.out.println("-------Nested loops------");
		// x loop shall run 5 times
		for(int x=1; x<=5;x++){
			System.out.println("For X: "+x);
			// Loop within a Loop
			for(int y=1;y<=5;y++){
				System.out.print(y+" ");
			}
			System.out.println();// for a next line
		}
		
		System.out.println("====Table of 1st 10 numbers====");
		for(int n=1;n<=100;n++){
			System.out.println("==Table of "+n+"===");
			for(int j=1;j<=10;j++){
				System.out.println(n+" "+j+"'s are "+(n*j));
			}
			System.out.println();
			System.out.println();
		}
		
		// Exploration : break, continue and goto statements
		
	}

}
