final class CA{ // which cannot be inherited
	final void fun(){ // final method cannot be overrided in child
		
	}
}

class CB{ //extends CA{
	/*void fun(){ // Overriding
		
	}*/
}
public class FinalDemo {

	public static void main(String[] args) {
		
		int x = 10;
		x = 100; // Anytime x can be modified
		
		final int y = 10;
		//y = 100; // Cannot Modify it as y is now constant

	}

}
