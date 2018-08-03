package co.edureka.threads;

class Message{
	
	String data = "No Message Available";
	
	void writeMessage(String msg){
		data = msg;
		System.out.println("(W:) ==Message Written Successfully==");
	}
	
	void readMessage(){
		System.out.println("(R:) Message is: =="+data+"==");
	}
	
}

class ReaderThread extends Thread{
	
	Message m;
	
	ReaderThread(Message n){
		m = n;
	}
	
	public void run(){
		synchronized(m){
			System.out.println("--Reader Entered--");
			try {
				// wait to perform any operation on m until you are notified
				// goes in a wait state. no more executiona dn releases lock..
				m.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			m.readMessage();
			System.out.println("--Reader Exited--");
		}
	}
}


class WriterThread extends Thread{
	
	Message m;
	
	WriterThread(Message n){
		m = n;
	}
	
	public void run(){
		synchronized(m){
			System.out.println("--Writer Entered--");
			m.writeMessage("Be Exceptional");
			
			// notify the thread which is on wait
			//m.notify();
			
			// notify all the threads which are on wait for m
			m.notifyAll();
			System.out.println("--Writer Exited--");
		}
	}
}

public class WNDemo {

	
	
	public static void main(String[] args) {
		
		Message m = new Message();

		// Both Reader and Writer are working on same object
		// So, they are having sync blocks so that they can acquire the lock and work synchronously
		ReaderThread rt1 = new ReaderThread(m);
		ReaderThread rt2 = new ReaderThread(m);
		WriterThread wt = new WriterThread(m);
		
		// we see that rt is started before wt and hence rt will run first
		rt1.start();
		rt2.start();
		wt.start();
	}

}
