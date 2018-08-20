package co.edureka;

import java.util.Date;
import java.util.Random;

public class Conversion {

	public int mtrsToCms(int mtrs){
		int cms = mtrs * 100;
		return cms;
	}
	
	public int feetsToInches(int feets){
		int inches = feets * 12;
		return inches;
	}
	
	public int dollarToRupee(int dollar){
		// Some dynamic logic shall be written
		int rupee = dollar*67;
		return rupee;
	}
	
	public String registerUser(String email, String password){
		// DB Code Here
		String response = "User with "+email+" Registered at "+new Date();
		return response;
	}
	
	public int generateOTP(String phone){
		// DB Code Here
		Random random = new Random();
		int otp = random.nextInt(1000) + 1;
		return otp;
	}
}
