class PrintData{

	// Taking a value as input
	void printNum(int num){ // Value Passing
		num += 100;
		System.out.println("Number is: "+num);
	}
	
	// Taking a reference as input
	void printArray(int[] ref){ // Ref Passing
		System.out.println("-----printArray-----");
		System.out.println("ref is: "+ref);
		for(int i=0;i<ref.length;i++){
			ref[i] += 100;  // ref[i] = ref[i] + 100 // ref[0] = ref[0] + 100  | ref[1] = ref[1] + 100 .. ..... .....
			System.out.print(ref[i]+"  ");
		}
		System.out.println();
	}
	
}

public class ValueRef {

	public static void main(String[] args) {
		
		PrintData printData = new PrintData(); // Object Construction
		
		int n = 10;
		
		int[] a = {10,20,30,40,50};
		
		System.out.println("n before: "+n);
		printData.printNum(n); // Calling a method with value
		System.out.println("n after: "+n);
		
		System.out.println("*******************");
		System.out.println("a is: "+a);
		System.out.println("a before:");
		for(int e : a){
			System.out.print(e+"  ");
		}
		System.out.println();
		printData.printArray(a); // Calling a method with Reference
		System.out.println("a after:");
		for(int e : a){
			System.out.print(e+"  ");
		}
	}

}
