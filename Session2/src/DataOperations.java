
public class DataOperations {

	public static void main(String[] args) {
		
		// Data Operations is a part of Logic !!
		int num1 = 100;
		int num2 = 200;
		
		int num3 = num1 + num2;
		System.out.println("num3 is: "+num3);
		
		num3++;
		++num3;
		
		System.out.println("num3 is: "+num3);
		
		num3 += 15; // num3 = num3 + 15
		
		System.out.println(num3);
		
		int num4 = num3 % 2;
		System.out.println("num4 is: "+num4);
		
		boolean flag = num3 > num1;
		System.out.println("flag is: "+flag);
		
		num1 = 1000;
		flag = num3>num1 && num3>num2;
		System.out.println("flag is: "+flag);
		
		flag = num3>num1 || num3>num2;
		System.out.println("flag is: "+flag);
		
		flag = !(num3>num1 || num3>num2);
		System.out.println("flag is: "+flag);
	}

}
