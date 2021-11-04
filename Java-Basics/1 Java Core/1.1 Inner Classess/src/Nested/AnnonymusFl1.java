package Nested;

public class AnnonymusFl1 {
	public static void main(String[] args) {
		
	// last step is to create an object of the class that holds anonymous and use it to 
	// call the method that calls all other methods from anonymous
		
		Second s = new Second();
		s.getUs();	
	}
//	second step is to create method with the same names in the test class
	// but they might have no funcionlity at all
	public void print1(){		
	}	
	public void print2(){		
	}
}
class Second{	
	// first step 
	//
	// create object of other class in different class
	AnnonymusFl1 an = new AnnonymusFl1() { // check the braces
		
		
		// whole this part is placed into object statement body
		// first method
		public void print1(){
			System.out.println("Now you are printing annonymus 1 ");
		}
		// second method that does something
		public void print2(){
			System.out.println("Now you are printing annonymus 2 ");			
		}
	}; // look here semicolon after braces
	
	// third step is to create method that will have access to the above methods
	// through the object of test class and thats the reason they have to be there
	public void getUs(){
		an.print1();
		an.print2();
	}	
}