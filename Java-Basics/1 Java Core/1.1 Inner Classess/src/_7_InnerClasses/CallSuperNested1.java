package _7_InnerClasses;


public class CallSuperNested1 {
	public static void main(String args[]){
	
		
	/** this is the best way to call all classes from outside class. This is common practice that keep tight 
	 *  encapsulation 
	 */	
		
		SuperNested s = new SuperNested(); // Here you call top level class constructor
		s.CallMe();						   // and its method that call the other classes itself	
		
	/** this is second way to call all classes from outside class. This practice is not common
	 *  Because you have to keep your inner classes private which weaken your class security 
	 */
		
//		SuperNested sn = new SuperNested(); // Here you call top level class constructor
//		sn.CallMe();
//		
//		SuperNested.Outer1 outer = sn.new Outer1(); // Here you call first level nested class constructor
//		outer.CallMe();
//		
//		SuperNested.Outer1.Inner1 inner = outer.new Inner1(); // Here you call second level class constructor
//		inner.CallMe();
		
	}
}
