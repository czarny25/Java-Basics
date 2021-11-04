package Nested;

/**
 * Right here I am going to create anonymous class stright from interface  
 */


// Step first is here 
// create an interface with some method that you want to use later
interface Cookable {	
	public void cook();
}

// Step two
// now we need a class that will hold anonymous and other stuff
public class AnnonymusClassesFlavorTwo implements Cookable{ // I don't know any reason for that but it 
															// is possible to implements this interface
															// normal way and give this method some other 
															// functionality 
	
	// here anonymous is created using "object" of interface
	// using word "new" in connection with interface is allowed here
	Cookable c = new Cookable(){ // make anonymous class of type interface Cookable
		
		// once we have it the rule about implementing all interface methods 
		// force us to override method "cook()"
		@Override
		public void cook() {
			System.out.println("anonymous cookable implementer"); // here is some job
		}		
	};
    // now we need method that will gather all
	public void cooker(){		
		c.cook();
	}
	
	public static void main(String[] args) {
		// and using class object run it
		AnnonymusClassesFlavorTwo a = new AnnonymusClassesFlavorTwo();
		a.cooker();
		
		a.cook();
		
	}
	// Second override and different implementation
	@Override
	public void cook() {
		System.out.println("now all is fucked up");
		
	}
}


