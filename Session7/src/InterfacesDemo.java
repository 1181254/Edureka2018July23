interface Inf1{
	void show();
	void fun();
	
	int i = 10; // -> public static final int i = 10; // static here means property of interface
}

interface Inf2{
	void show();
	void hello();
}


// interfaces can inherit other interfaces and can do so in a multiple way
// But remember, this is neither object to object, nor class to class, it is simple interface to interface
interface Inf3 extends Inf1, Inf2{
	int i = 100;
}

class CC implements Inf3{//Inf1, Inf2{ // -> Multiple Implementation and not Multiple Inheritance
	
	public void show(){
		System.out.println("This is show");
	}
	
	public void fun(){
		System.out.println("This is fun");
	}
	
	public void hello(){
		System.out.println("This is hello");
	}
	
	void bye(){
		System.out.println("This is bye");
	}
}

public class InterfacesDemo {

	public static void main(String[] args) {
		
		Inf1 i1 = new CC(); // Polymorphic Statament. Ref Var of Interface can point to the object which implements it !!
		i1.show();
		i1.fun();

		System.out.println("-------------");
		
		Inf2 i2 = new CC();
		i2.show();
		i2.hello();
		
		// error below:  as they do not exist as a rule in Inf2
		// i2.fun();
		// i2.bye();
		
		System.out.println("-------------");
		
		Inf3 i3 = new CC();
		i3.show();
		i3.hello();
		i3.fun();
		
		System.out.println("i is: "+Inf1.i);
		System.out.println("i is: "+Inf3.i);
		System.out.println("i is: "+CC.i);
	}

}
