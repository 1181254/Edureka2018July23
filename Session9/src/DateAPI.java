import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateAPI {

	public static void main(String[] args) {
		
		Date date = new Date();
		System.out.println("Today is: "+date);

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm");
		String formattedDate = sdf.format(date);
		
		System.out.println(formattedDate);
		
		// HW: Explore Calendar API
		Calendar calendar = Calendar.getInstance();
		// Explore further ..
		
	}

}
