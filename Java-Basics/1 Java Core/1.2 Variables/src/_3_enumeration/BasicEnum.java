package _3_enumeration;

enum Week {
	  Monday, Tuesday, Wednesday, Thursday, Friday, Saturaday, Sunday
	}

public class BasicEnum {

	public static void main(String args[]) {
	    
		Week aWeekDay;

	    aWeekDay = Week.Monday;

	    // Output an enum value.
	    System.out.println("Value of aWeekDay: " + aWeekDay);
	    System.out.println();
	
	    Week[]days  = Week.values(); // this method creates data collection of given enum values
	    
	    System.out.println(days[2].toString());
	
	}
}
