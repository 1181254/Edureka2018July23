
public class Problem {

	public static void main(String[] args) {
		
		// Data Storage in SVC
		// Easy for 5 Regions
		// Considering for n number of regions as n increases this approach wont fit in.
		int azDemVotes = 567;
		int azRepVotes = 196;
		
		int flDemVotes = 756;
		int flRepVotes = 453;
		
		int vmDemVotes = 657;
		int vmRepVotes = 234;
		
		int txDemVotes = 345;
		int txRepVotes = 567;
		
		int gjDemVotes = 234;
		int gjRepVotes = 765;
				
		int demVoteCount = azDemVotes + flDemVotes + vmDemVotes + txDemVotes + gjDemVotes;
		int repVoteCount = azRepVotes + flRepVotes + vmRepVotes + txRepVotes + gjRepVotes;
		
		if(demVoteCount > repVoteCount){
			System.out.println("Democratic Party won by "+(demVoteCount-repVoteCount)+" votes");
		}else{
			System.out.println("Republican Party won by "+(repVoteCount-demVoteCount)+" votes");
		}
		
		// Multi Value Container -> Reference
		// Homogeneous in Nature
		// Array
		// When we have more than 1 value, we shall use Arrays
		int[] demVotes = {567,756,657,345,234};
		int[] repVotes = {196,453,234,567,765};
		
		// demVotes and repVotes are Reference Variables as they hold some address
		
		System.out.println(demVotes); // Address
		System.out.println(repVotes); // Address
		
		// Read the Data in Array
		System.out.println("demVotes[0] is: "+demVotes[0]); // 567
		System.out.println("demVotes[1] is: "+demVotes[1]); // 756
		
		System.out.println("repVotes[1] is: "+repVotes[1]); // 453
		System.out.println("repVotes[2] is: "+repVotes[2]); // 234
		
		// Single Value Container -> Primitive
		// num is a variable which holds data as value
		int num = 100;
		
		// Calculate size of Array
		System.out.println("Length of demVotes is: "+demVotes.length);
		System.out.println("Length of repVotes is: "+repVotes.length);
		
		int dvCount = 0, rvCount = 0;
		
		// Read Entire Array
		// Read All Elements from Array using indexes
		for(int i=0;i<demVotes.length;i++){
			System.out.print(demVotes[i]+"  ");
			dvCount = dvCount + demVotes[i];
		}
		
		System.out.println();
		
		for(int i=0;i<repVotes.length;i++){
			System.out.print(repVotes[i]+"  ");
			rvCount = rvCount + repVotes[i];
		}
		
		System.out.println();
		
		// Enhanced For Loop : As of now we can use it to read an array only
		// Automatically begins from index 0 to length and reads the data and puts it in elm
		for(int elm : repVotes){ // for elm in demVotes
			System.out.print(elm+"  ");
		}

		System.out.println();
		
		if(dvCount > rvCount){
			System.out.println("Democratic Party won by "+(dvCount-rvCount)+" votes");
		}else{
			System.out.println("Republican Party won by "+(rvCount-dvCount)+" votes");
		}
		
		// Representing data is simplified more when we can have Array of Arrays
		int[][] votes = {
							{567,756,657,345,234}, // 0th index representing Dem Party Votes for various Regions
							{196,453,234,567,765}  // 1st index representing Rep Party Votes for various Regions
						};
		
		// Write logic to see who wins below:
		
		// 5 1-D arrays with 5 elements each
		// int[][] a = new int[5][5];
		
	}

}
