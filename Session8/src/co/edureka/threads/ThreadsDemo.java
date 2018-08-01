package co.edureka.threads;

/*class Task{
	void executeTask(){
		for(int i=1;i<=10;i++){
			System.out.println("@@Task@@ "+i);
		}
	}
}*/

class Task extends Thread{ // Task is a Thread
	public void run(){
		for(int i=1;i<=10;i++){
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("@@Task@@ "+i);
		}
	}
}

class CA{
	
}

class MyTask extends CA implements Runnable{
	public void run(){
		for(int i=1;i<=10;i++){
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("$$MyTask$$ "+i);
		}
	}
}

public class ThreadsDemo {

	// Jobs to be performed by main thread in a sequence are written in the main method
	public static void main(String[] args) {
		
		System.out.println("==App Started==");
		
		//Task tRef = new Task();
		//tRef.executeTask();
		
		Task tRef = new Task();
		
		Runnable r = new MyTask(); // Polymorphic Statement
		Thread mRef = new Thread(r);
		
		tRef.setName("John");
		mRef.setName("Jennie");
		Thread.currentThread().setName("Jack");
		
		tRef.setPriority(Thread.MAX_PRIORITY); // 10
		mRef.setPriority(Thread.MIN_PRIORITY); // 1
		Thread.currentThread().setPriority(Thread.NORM_PRIORITY); // 5
		
		System.out.println("tRef State before start is: "+tRef.getState());
		
		tRef.start(); // start method will internally execute run method of thread !! (Thread will have some states which are managed automatically )
		
		System.out.println("tRef State after start is: "+tRef.getState());
		try {
			tRef.join(); // executed immediately after start
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		
		mRef.start();
		
		mRef.yield();
		
		for(int i=1;i<=10;i++){
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("**Main Thread** "+i);
		}
		
		System.out.println("tRef name is: "+tRef.getName()+" and priority is "+tRef.getPriority());
		System.out.println("mRef name is: "+mRef.getName()+" and priority is "+mRef.getPriority());
		System.out.println("main name is: "+Thread.currentThread().getName()+" and priority is "+Thread.currentThread().getPriority());
		
		System.out.println("tRef State before app finishes is: "+tRef.getState());
		
		System.out.println("==App Finished==");
		
	}

}
