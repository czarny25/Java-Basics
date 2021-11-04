package Nested;

public class StaticNested {

	public static void main(String[] args){		
		
		//this is the way how to instantiate inner static class from other class
		IhaveStatic.sampleStatic ss = new IhaveStatic.sampleStatic();
		ss.showUP();		
	}
}
class IhaveStatic{	
	
	private int num = 34;
	private static int num1 = 45;
	
		/** this is static class inside normal class 
		* it has no access to class variable like num for example 
	    * Is usually created for simple purpose and stays open to 
	    * outside classes and users
	    */		    
		static class sampleStatic{
			public void showUP(){				
				// here we see that static class member has no access to outer class non static members even if they 
				// are non static too				
//				System.out.println("sampleStatic from Nested was Called with num " + num); // this won't compile
				System.out.println("sampleStatic from Nested was Called with num " + num1);
			}
		}

}
