package Nested;

/**
 * This is example of most strange anonymous class.
 */

// first create some interface
interface Foo {
	void foof();	
}
interface Poo {
	void poop();	
}
// second create some class
class Bar {	
void doStuff(Object f){}	
}

// and now we need a class that will run all that 

public class ArgumentDefinedAnonymousClasses {

	public ArgumentDefinedAnonymousClasses(){}
	
	
	
	
//	public static void main(String[] args) {
//		
//		ArgumentDefinedAnonymousClasses a = new ArgumentDefinedAnonymousClasses();
//		a.go();
//	
//	}
	
	// this method plays the crucial part
	
	public Object go() {
		// right here we create an object of previously created class
		Bar b = new Bar();
		// now we call class method
		b.doStuff
			(new Foo(){           		// now we put an object as an argument
			public void foof(){	  		// this argument straight away calls 
				
				System.out.println("foofy");
				}
			}
			); // now we prints
	
		
		// here we create another anonymous using Bar class and Poo interface
		// this time all is in one line
		b.doStuff(new Poo(){public void poop(){System.out.println("poopy");}});
	
		return b;
	}
}
		

