package _7_InnerClasses;

public class CallSubnested {
	
		public static void main(String args[]){		
			
		/** this is the best way to call all classes from outside class. This is common practice that keep tight 
		 *  encapsulation 
		 */	
			
			SubNested s = new SubNested(); // Here you call top level class constructor
			s.CallMe();						   // and its method that call the other classes itself	
			
		/** 
		 * All do it is possible to inherit nested class We should not do that 
		 */
		
		
		// this is call to static Class	
			StaticNested sn = new StaticNested();
			
			StaticNested.sampleStatic  ss = new StaticNested.sampleStatic();
			ss.showUP();
		}
	}

