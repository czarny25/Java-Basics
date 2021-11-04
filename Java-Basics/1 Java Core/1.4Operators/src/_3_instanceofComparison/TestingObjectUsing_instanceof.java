package _3_instanceofComparison;

class lola{	
}
class A extends lola{	
} // use this class to create object from

public class TestingObjectUsing_instanceof extends A {

	/**
	 * 	The instanceof operator is used for object reference variables only, and you can
		use it to check whether an object is of a particular class or interface type,
		
		if the object referred to by the variable on the left side of the operator passes the IS-A test 
		for the class or interface type on the right side
		
		The following example demonstrates a common use for instanceof: testing an
		object to see if it's an instance of one of its subtypes, before attempting a "downcast":
		
	 */
		public static void main(String[] args) {
			
			A myA = new TestingObjectUsing_instanceof();
			A myA1 = new A();
			TestingObjectUsing_instanceof myI = new TestingObjectUsing_instanceof();
			
			// here we create a few object reference 
			m2(myA);
			m2(myA1);
			m2(myI);
			
		}
		// this method will make sure that reference we pass in, refers to object we we want 
		public static void m2(A a) {
		
			if (a instanceof TestingObjectUsing_instanceof){
			
				// if it does we make cast to this object for functionality
				((TestingObjectUsing_instanceof)a).doBstuff(); // downcasting an A reference
			}else{
				// if it does not print info message
				doBstuff2();}
		}
		public static void doBstuff() {		
			System.out.println("'a' refers to a TestingObjectUsing_instanceof");
		}
		
		public static void doBstuff2() {
			System.out.println("'a' doesn't refers to a TestingObjectUsing_instanceof");
		}
		

}






