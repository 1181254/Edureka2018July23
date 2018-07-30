
public class WhatsApp {

	// Property of Object
	String statusTitle;
	
	// Property of Class
	static String groupTitle;
	
	// Non-Static : Property of Object and can access property of class i.e. groupTitle
	void showTitle(){
		System.out.println("StatusTitle is "+statusTitle+" and GroupTitle is: "+groupTitle);
	}
	
	// Static : Property of Class and cannot access property of objet i.e. statusTitle : error
	//static void showTitleAgain(){
	//	System.out.println("StatusTitle is "+statusTitle+" and GroupTitle is: "+groupTitle);
	//}
	
}
