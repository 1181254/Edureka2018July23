package co.edureka.packtwo;

import co.edureka.packone.One; // only public classes can be imported outside the package
//import co.edureka.packone.Two; // We cannot import a class which is default

// Inheritance Across the Package
// Only protected and public shall be inherited.
// But, protected once inherited outside the package, behaves as private after inheritance
class CA extends One{
	void show(){
		protShow();
	}
}

public class App {

	public static void main(String[] args) {
		
		One oRef = new One();
		//Two tRef = new Two();
		
		// private isnt accessible outside class/object
		//oRef.pvtShow();
		// default and protected isnt accessible outside package
		//oRef.defShow();
		//oRef.protShow();
		
		// public is accessible inside/outside package
		oRef.pubShow();
		
		/*System.out.println("----------");
		//tRef.pvtShow();
		tRef.defShow();
		tRef.protShow();
		tRef.pubShow();*/
		
		CA ca = new CA();
		ca.pubShow();
		//ca.protShow(); // error -> inherited but behaves as private
		ca.show();
	}

}
