package Nested;

/**
 * This class shows how to refer to outer and inner class from inner class
 * by using word this along with Outer name
 */


public class GoodExample2 {
	
	public static void main(String[] args) {
		
		Outer.Inner iner = new Outer().new Inner();
		iner.Print();
//		
//		Outer outer = new Outer();
//		outer.makeInner();
	}
}
class Outer{
	
	int size = 23;
	
//	void makeInner(){
//	Inner in = new Inner();
//	in.Print();}
	
	class Inner{
		
		int size = 45;
		public void Print(){
			
			System.out.println("Inner's size is  " + size);
			System.out.println("Outer's size is " + Outer.this.size); // right here we use word "this" 
																	  // to refer to outer class
			System.out.println("My size is " + this.size);			
		}		
	}
}