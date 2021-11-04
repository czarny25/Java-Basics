package Nested;

public class CallClassesNestedInMethods {
	
	public static void main (String[] args){
	
	ClassesNestedInMethods cm = new ClassesNestedInMethods();
	cm.ClassIn();
        
	}
}	
class ClassesNestedInMethods {
	
	private int num1 = 23;
	
	public void ClassIn(){		
				
		final String name = "Paddy";  // If you want to refer to local data from inner class they must be final
		
			class Inner11{
				
				String end = " end";
				
				public void doSomthing(){
					System.out.println(name + " have access to all goods like " + num1 + end);
				}
			}
		// here is the class initialized inside "ClassIn" method !!! without this class and method are useless 
		// inner class can be instantiated only within the method where the inner class is defined. 
		// In other words, no other code running in any other method—inside or outside the outer class	
		// class instantiation must be placed below class declaration	
		
		Inner11 inn = new Inner11();  
		inn.doSomthing();
		
	}
}

