package _7_InnerClasses;

class ClassesNestedInMethods {
	
	private int num1 = 23;
	
	
	
	
	public void ClassIn(){		
				
		final String name = "Paddy"; // If you want to refer to local data from inner class they must be final
		
		class Inner11{
			public void doSomthing(){
				System.out.println("I have access to all goods like " + num1);
			}
		}
		Inner11 inn = new Inner11(); // here is the class initialized inside "ClassIn" method
		inn.doSomthing();
		
	}
	
}	


