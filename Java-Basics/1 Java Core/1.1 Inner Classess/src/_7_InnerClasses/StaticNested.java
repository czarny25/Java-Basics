package _7_InnerClasses;

public class StaticNested {
	
	private int num = 34;
	
	
		/** this is static class inside normal class 
		* it has no access to class variable like num for example 
	    * Is usually created for simple purpose and stays open to 
	    * outside classes and users
	    */
	    
	
		static class sampleStatic{
			public void showUP(){
				System.out.println("sampleStatic from Nested was Called with num ");
			}
		}

}
