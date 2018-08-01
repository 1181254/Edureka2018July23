package co.edureka.exceptions;

public class App {

	public static void main(String[] args) {
		
		System.out.println("==App Started==");
		
		boolean DEBUG_MODE = true;
		
					// 0   1   2   3   4
		int[] arr = { 10, 20, 30, 40, 50 };
		int a=10,b=0,c=0;
		
		try{
			System.out.println("arr[2] is: "+arr[2]);
			c = a/b;
		}/*catch(ArrayIndexOutOfBoundsException aRef){
			if(DEBUG_MODE){
				// We can Debug whats the problem !!
				//System.out.println("Error is: "+aRef);
				aRef.printStackTrace();
			}else{
				System.out.println("OOPS!! Something Went Wrong !!");
			}
		}catch(ArithmeticException ae){
			System.out.println("Some Error: "+ae);
		}*/
		catch(Exception e){ // Run Time Polymorphism
			if(DEBUG_MODE){
				// We can Debug whats the problem !!
				//System.out.println("Error is: "+e);
				e.printStackTrace();
			}else{
				System.out.println("OOPS!! Something Went Wrong !!");
			}
		}finally{
			System.out.println("c is: "+c);
			System.out.println("This is Important Statement !!");
		}
		
	
		System.out.println("==App Finished==");
		
	}

}
