package co.edureka;

class Application{
	
	private static Application a = new Application();
	
	private Application() {
		System.out.println("==Application Object Constructed==");
	}
	
	public static Application getApplication(){
		return a;
	}
}

public class Singleton {

	public static void main(String[] args) {
		
		/*Application a1 = new Application();
		Application a2 = new Application();
		
		System.out.println("a1 is: "+a1);
		System.out.println("a2 is: "+a2);*/
		
		Application a1 = Application.getApplication();
		Application a2 = Application.getApplication();
		
		System.out.println("a1 is: "+a1);
		System.out.println("a2 is: "+a2);

	}

}
