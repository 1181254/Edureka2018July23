package co.edureka.exceptions;

import java.io.IOException;

// CHECKED EXCEPTION CREATED BY USER
class MyBankingException extends Exception{
	public MyBankingException(String message) {
		super(message); // pass the message to parent object's constructor
	}
}

// UNCHECKED EXCEPTION CREATED BY USER
class YourBankingException extends RuntimeException{
	public YourBankingException(String message) {
		super(message); // pass the message to parent object's constructor
	}
}

class Banking {
	
	int balance = 10000;
	int minBal = 3000;
	
	int attempts = 0;
	
	void withdraw(int amt){
		
		balance = balance - amt;
		
		if(balance <=3000){
			attempts++;
			balance = balance + amt;
			System.out.println("Withdrawl Failed!! Balance is LOW: \u20b9"+balance);
		}else{
			System.out.println("Withdrawl Success!! New Balance is: \u20b9"+balance);
		}
		
		// We shall Crash the program ourselves
		if(attempts == 3){
			// ArithmeticException is Child of RuntimeException and hence an UNCHECKED EXCEPTION
			// Throwing an UNCHECKED EXCEPTION here !!
			//ArithmeticException ae = new ArithmeticException("Illegal Attempts !!");
			//throw ae;
			YourBankingException yb = new YourBankingException("Illegal Attempts !!");
			throw yb;
		}
	}
	
	void withdrawAgain(int amt) throws IOException, MyBankingException{
		
		balance = balance - amt;
		
		if(balance <=3000){
			attempts++;
			balance = balance + amt;
			System.out.println("Withdrawl Failed!! Balance is LOW: \u20b9"+balance);
		}else{
			System.out.println("Withdrawl Success!! New Balance is: \u20b9"+balance);
		}
		
		// We shall Crash the program ourselves
		if(attempts == 3){
			// IOException is CHECKED EXCEPTION
			// Throwing a CHECKED EXCEPTION here, compiler will prompt us !!
			//IOException io = new IOException("Illegal Attempts !!");
			//throw io;
			MyBankingException mRef = new MyBankingException("Illegal Attempst !!");
			throw mRef;
		}
	}
	
}

public class ThrowThrows {

	public static void main(String[] args) {
		
		System.out.println("==Banking Started==");

		Banking b = new Banking();
		
		/*for(int i=1;i<=1000;i++){ // Wasting Bank's Resources
			b.withdraw(3000);
		}*/
		
		try{
			for(int i=1;i<=1000;i++){ // Wasting Bank's Resources
				b.withdrawAgain(3000);
			}
		}catch(Exception e){ // RTP
			System.out.println("Some Error: "+e);
		}
		
		System.out.println("==Banking Finished==");
	}

}
