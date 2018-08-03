package co.edureka.threads;

class Table{
	
	
	//synchronized void printTable(int num){ // When a thread executes a synchronized method no other thread can access it until the execution is finsihed by previous thread
		// A lock will be acquired so that no one else can access it !!
	
	void printTable(int num){
		for(int i=1;i<=10;i++){
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(num+" "+i+"'s are "+(num*i));
		}
	} // Lock will be released when method is finished so that other thread can access it !!

	void hello(){
		System.out.println("this is hello !!");
	}
	
	//....
}


class MyThread extends Thread{
	
	Table t;
	
	MyThread(Table s){
		t = s;
	}
	
	public void run() {

		// synchronized block
		synchronized (t) { // Lock shall be acquired on object here
			t.printTable(5);
			t.hello();
		} // Lock shall be released on object here

	}
	
}

class YourThread extends Thread{
	
	Table t;
	
	YourThread(Table s){
		t = s;
	}
	
	public void run() {
		
		synchronized (t) {
			t.printTable(7);
		}

	}
	
}

public class SyncDemo {

	public static void main(String[] args) {
		
		Table t = new Table();
		//t.printTable(5);
		
		// Multiple threads are working on SAME OBJECT of Table pointed by t
		MyThread mRef = new MyThread(t);
		YourThread yRef = new YourThread(t);
		
		// Threads will start asynchronously. i.e. parallely or concurrently
		// But, when we have multiple threads working on a same object this can cause many issues.. ??
		// Data can go inconsistent !! System can go slow !!
		// We shall be executing threads synchronously. i.e. one after the other. (IFF Multiple Threads are working on Same Object)
		mRef.start();
		yRef.start();
	}

}
