package NumbersAndCurrencies;
import java.util.*;
public class NumbersApi {

	/**
	 *  ■ java.util.Date - Most of this class's methods have been deprecated, but
		you can use this class to bridge between the Calendar and DateFormat class.
		An instance of Date represents a mutable date and time, to a millisecond.
		
		■ java.util.Calendar - This class provides a huge variety of methods that
		help you convert and manipulate dates and times. For instance, if you want
		to add a month to a given date, or find out what day of the week January 1,
		3000 falls on, the methods in the Calendar class will save your bacon.
		
		■ java.text.DateFormat - This class is used to format dates not only
		providing various styles such as "01/01/70" or "January 1, 1970," but also to
		format dates for numerous locales around the world.
		
		■ java.text.NumberFormat - This class is used to format numbers and
		currencies for locales around the world.
		
		■ java.util.Locale - This class is used in conjunction with DateFormat
		and NumberFormat to format dates, numbers and currency for specific locales.
		With the help of the Locale class you'll be able to convert a date like
		"10/10/2005" to "Segunda-feira, 10 de Outubro de 2005" in no time. If you
		want to manipulate dates without producing formatted output, you can use
		the Locale class directly with the Calendar class.
	 */
	public static void main(String[] args) {
		
		// Get current data and time
		
		//Create a Date 
		Date d = new Date();
		
		// Get its value
		String s = d.toString();
		
		System.out.println(s); // prints current data and time
	
	
		// Create a Calendar:
		
		Calendar c = Calendar.getInstance();
		
		System.out.println(c);
		
		c.add(12, 45); 
		
		System.out.println(c);
		
		//and 
		
//		c.roll(48, 26); // to perform date and time manipulations
		
		
		// Create a Locale:
			Locale loc1 = new Locale("CHINA");
			
			Locale loc2 = new Locale("polish", "Poland");
			
			// Create a Calendar for that locale:
			
			Calendar c3 = Calendar.getInstance(loc2);
		
			System.out.println(c3.toString());
			
	}

}
