package co.edureka.packone;

public class App {

	public static void main(String[] args) {

		One oRef = new One();
		Two tRef = new Two();
		
		// private isnt accessible outside class/object
		//oRef.pvtShow();
		oRef.defShow();
		oRef.protShow();
		oRef.pubShow();
		
		System.out.println("----------");
		//tRef.pvtShow();
		tRef.defShow();
		tRef.protShow();
		tRef.pubShow();
	}

}
