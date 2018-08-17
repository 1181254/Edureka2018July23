package co.edureka;

interface Cab{
	void setPriceAndRoute();
	void showBookingDetails();
}

class UberGo implements Cab{
	
	int price;
	String route;
	
	public void setPriceAndRoute() {
		price = 200;
		route = "SourceA to Destinition B";
	}
	
	public void showBookingDetails() {
		System.out.println("UberGo Booked and please pay \u20b9"+price+" for route: "+route);
	}

}

class UberX implements Cab{
	
	int price;
	String route;
	
	public void setPriceAndRoute() {
		price = 500;
		route = "SourceA to Destinition B";
	}
	
	public void showBookingDetails() {
		System.out.println("UberX Booked and please pay \u20b9"+price+" for route: "+route);
	}

}

class UberMoto implements Cab{
	
	int price;
	String route;
	
	public void setPriceAndRoute() {
		price = 100;
		route = "SourceA to Destinition B";
	}
	
	public void showBookingDetails() {
		System.out.println("UberMoto Booked and please pay \u20b9"+price+" for route: "+route);
	}

}

abstract class CabDecorator implements Cab{
	
	Cab decoratedCab;
	
	public CabDecorator(Cab cab) {
		decoratedCab = cab;
	}
	
	public void setPriceAndRoute() {
		decoratedCab.setPriceAndRoute();
	}
	
	public void showBookingDetails(){
		decoratedCab.showBookingDetails();
	}
}

class UberBlackCabDecorator extends CabDecorator{

	public UberBlackCabDecorator(Cab cab) {
		super(cab);
	}
	
	public void setPriceAndRoute() {
		decoratedCab.setPriceAndRoute();
	}
	
	public void showBookingDetails(){
		decoratedCab.showBookingDetails();
		allocateUberBlack(decoratedCab);
	}
	
	private void allocateUberBlack(Cab cab){
		System.out.println("UberBlack is allocated as a Surprise !!");
	}
}


class CabFactory{
	
	static Cab getCab(int type){
		
		Cab cab = null;
		
		switch (type) {
			case 1:
				cab = new UberGo();
				break;
				
			case 2:
				cab = new UberX();
				break;
				
			case 3:
				cab = new UberMoto();
				break;

		}
		cab.setPriceAndRoute();
		return cab;
	}
	
}

public class Factory {

	public static void main(String[] args) {
		
		//Cab cab = CabFactory.getCab(3);
		//cab.showBookingDetails();
		
		Cab cab = new UberX();
		
		Cab uberBlack  = new UberBlackCabDecorator(cab);
		
		uberBlack.setPriceAndRoute();
		uberBlack.showBookingDetails();
	}

}
