package _6_garbageCollection;
import java.util.Date;
public class GarbageCollectionInThemethod {

	
	/**
	 * This method will create two objects
	 *   - StringBuffer is ready to take out once method getDate is completed
	 *   - Date object is returned to calling method and lives there 
	 */
	public static Date getDate() {
		Date d2 = new Date();
		System.out.println("I was born " + d2.toString());
		StringBuffer now = new StringBuffer(d2.toString());
		System.out.println("I was born " + now);
		return d2;
		}
	    // at this point object from line 14 can be taken out
	
	
	public static void main(String[] args) {
		
		Date d = getDate(); // returned object d2 from line 12 lives here as d
		
		System.out.println("d = " + d);
		
		}
	
	
	
		
	}


