package NumbersAndCurrencies;

import java.util.Calendar;
import java.util.TimeZone;

public class CalendarSample {
	
	
	public static void main(String[] args) {

		int cd = Calendar.MONDAY;
		
		System.out.println(cd);
		
		new CalendarSample().runThis();

	}
	
	
	public void runThis(){
		
		Calendar c = Calendar.getInstance();
		String cal = c.toString();
		
		TimeZone t = TimeZone.getTimeZone(cal);
		String tim = t.toString();
		
		
		System.out.println(tim);
		
	}

	
	
}
