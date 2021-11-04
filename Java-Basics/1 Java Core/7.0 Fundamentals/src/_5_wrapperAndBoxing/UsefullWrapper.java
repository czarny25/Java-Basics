package _5_wrapperAndBoxing;

/**
    ■ parseXxx() returns the named primitive.
	■ valueOf() returns a newly created wrapped object of the type that invoked
	the method.
 */


public class UsefullWrapper {

	public static void main(String[] args) {
		
		double d4 = Double.parseDouble("3.14");     // convert a String
													// to a primitive
		System.out.println("d4 = " + d4); 			// result is d4 = 3.14

		Double d5 = Double.valueOf("3.14"); 		// create a Double obj
		
		System.out.println(d5 instanceof Double); 	// result is "true"
	
		
		long L2 = Long.parseLong("101010", 2); 		// binary String to a
													// primitive
		System.out.println("L2 = " + L2); 			// result is: L2 = 42
		
		
		Long L3 = Long.valueOf("101010", 2); 		// binary String to
													// Long object
		System.out.println("L3 value = " + L3); 	// result is:
													// L3 value = 42
	
		Double d = new Double("3.14");
		
		System.out.println("d = "+ d.toString() );  // result is d = 3.14
		
		
		String s3 = Integer.toHexString(254);  		// convert 254 to hex
		
		System.out.println("254 is " + s3); 		// result: "254 is fe"
		
		
		String s4 = Long.toOctalString(254); 		// convert 254 to octal
		
		System.out.print("254(oct) ="+ s4); 		// result: "254(oct) =376"
		
	}

}
