package _6_garbageCollection;
import java.util.Date;

/** 
 * This is very interesting class that will calculate memory before and after 
 * object creation process 
 */

public class CheckGC {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Runtime rt = Runtime.getRuntime();
		
		System.out.println("Total JVM memory: " + rt.totalMemory());
		
		System.out.println("Before Memory =   " + rt.freeMemory());
				 
		Date d = null;
				 
			for(int i = 0;i<10000;i++) {
					 
				d = new Date();				 
				d = null;
			}
			
		System.out.println("After Memory =    " + rt.freeMemory());
			
		for(int i = 0; i < 10; i++){
			rt.gc(); // an alternate to System.gc()
		
		System.out.println("After GC Memory = " + rt.freeMemory());
		}
	}

}
