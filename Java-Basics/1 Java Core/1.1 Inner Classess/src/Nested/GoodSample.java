package Nested;

public class GoodSample {

	public static void main(String[] args) {
		
		// this is the way to get to inner class method for outside of outer class or
		// any other static contents
		GoodSample out = new GoodSample();		
		GoodSample.Inner1 in = out.new Inner1();
		
		
		// This is other way to create object of inner class in outside of outter class
		GoodSample.Inner1 outoin = new GoodSample().new Inner1();
		
		
		in.PrintMe();
		outoin.takeMe();
		
	}
	/**
	 * This is inner class as you can see it can successfully extend or implement some
	 * other stuff from outside of outter class
	 */
	private class Inner1 extends AnotherClass implements Stuff{
		
		@Override
		public void takeMe() {
			System.out.println("I am in " + name);	
		}
		void PrintMe(){
			super.PrintMe();
		}		
	}	
}

// simple interface
interface Stuff{
	final String name = " Zenek";
	void takeMe();	
}

// class that holds some functionality
class AnotherClass{
	
	private String name = "John";
	
	void PrintMe(){
		System.out.println("I am in " + name);
	}
	
}