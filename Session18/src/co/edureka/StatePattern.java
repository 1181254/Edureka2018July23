package co.edureka;

interface State{
	void showState();
}

class Placed implements State{
	
	public void showState() {
		System.out.println("Order State is Placed");
	}
}

class Shipment implements State{
	
	public void showState() {
		System.out.println("Order State is Shipment");
	}
}

class Delivered implements State{
	
	public void showState() {
		System.out.println("Order State is Delivered");
	}
}

class Order{
	
	State state; // Has-A Relation
	
	public Order() {
		state = new Placed();
	}
	
	void changeState(State s){
		state = s;
	}
	
	State getState(){
		return state;
	}
	
}


public class StatePattern {

	public static void main(String[] args) {
		
		Order order = new Order();
		order.getState().showState();
		
		//....
		//....
		
		System.out.println("-------------");
		
		order.changeState(new Shipment());
		order.getState().showState();
		
		System.out.println("-------------");
		
		order.changeState(new Delivered());
		order.getState().showState();
	}

}
