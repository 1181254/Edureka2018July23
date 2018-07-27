
public class MutableStrings {

	public static void main(String[] args) {
		
		// IMMUTABLE
		String str = new String("Hello");
		
		// MUTABLE Strings
		StringBuffer buffer = new StringBuffer("Hello");		// Thread-Safe or Synchronized
		StringBuilder builder = new StringBuilder("Hello"); 	// Not Thread-Safe or Not Synchronized
		
		// They cannot be represented as Interned Strings
		//StringBuffer b1 = "Hello";  // err
		//StringBuilder b2 = "Hello"; // err
		
		str.concat(" World");
		buffer.append(" World");
		builder.append(" World");
		
		System.out.println("str is: "+str);
		System.out.println("buffer is: "+buffer);
		System.out.println("builder is: "+builder);
		
	}

}
