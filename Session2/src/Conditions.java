
public class Conditions {

	public static void main(String[] args) {
		
		// Considering, in Settings of mobile app we enabled i.e. turned the data network on.
		boolean isInternetConnected = true;
		
		// Considering, in Settings of mobile app we enabled i.e. turned the GPS Location on.
		boolean isGPSConnected = false;
		
		// if/else
		/*if(isInternetConnected){
			System.out.println("You can Browse Google Maps");
		}else{
			System.out.println("OOPS !! Some Connectivity Error. Please Connect to Internet and Retry !!");
		}*/
		
		
		// nested if/else
		if(isInternetConnected){
			if(isGPSConnected){
				System.out.println("You can Browse Google Maps");
			}else{
				System.out.println("Please Enable GPS and Retry !!");
			}
		}else{
			System.out.println("OOPS !! Some Connectivity Error. Please Connect to Internet and Retry !!");
		}
		
		int dataSpeed = 2; // 2Mbps
		boolean isGoToMeetingInstalled = true;
		
		if(isGoToMeetingInstalled && dataSpeed > 4){
			System.out.println("GoToMeeting shall work for Webinars");
		}else{
			System.out.println(dataSpeed+"Mbps Speed is Low to conduct a Webinar");
		}
		
		int numOfMatchesWon = 115;
		
		// Ladder if/else
		
		if(numOfMatchesWon >= 200){
			System.out.println("Team Ranks 1");
		}else if(numOfMatchesWon >=150 && numOfMatchesWon<200){
			System.out.println("Team Ranks 2");
		}else if(numOfMatchesWon >=100 && numOfMatchesWon<150){
			System.out.println("Team Ranks 3");
		}else{
			System.out.println("No Rank Achieved");
		}
		
		// Types of Cabs
		int uberGo = 1;
		int uberX = 2;
		int uberMoto = 3;
		
		int userChoice = uberX;
		
		if(userChoice == uberGo){
			System.out.println("UberGo booked from Domlur to Ejipura for \u20b9 100");
		}else if(userChoice == uberX){
			System.out.println("UberX booked from Domlur to Ejipura for \u20b9 150");
		}else if(userChoice == uberMoto){
			System.out.println("UberMoto booked from Domlur to Ejipura for \u20b9 40");
		}else{
			System.out.println("Please make a valid choice first to book the cab !!");
		}
			
		
		
	}

}
