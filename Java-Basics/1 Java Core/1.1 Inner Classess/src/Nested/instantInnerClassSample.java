package Nested;
/**
*	Author		:	Marcin*
*	Class 		:	The name of the Class contained within this class*
*	File Name	: 	The name of this file*
*	Date  		:	01/07/2013
*	Modified	:	
*	Purpose		:	This class shows how to use nested class to hide contains to end user
*	Reviewed by	:
*	Reference	:	Where the info was gotten from Slides noptes web page etc*
*	See ALSO	:	Look at this for more information
*/

// This is public top level class that has the same name as the file.
public class instantInnerClassSample {
			
		private int id; // not initialized
	
		// Non static inner class also called nested class
		// this class is private so it is not visible to the outside
		// inner class can implement and 
		private class InnerClass extends SuperClassClient implements Patern{
			
			// Non static inner class has the access to any other non static field
			private void callInner(int id){
				System.out.println("inner class with id:" + id + " has been called");
			}

			@Override
			public void displayWelcome() {
				// TODO Auto-generated method stub				
			}
			@Override
			public double calculateBenefit() {
				// TODO Auto-generated method stub
				return 0;
			}
			@Override
			public void displayResult() {
				// TODO Auto-generated method stub				
			}			
		}
		// top class constructor that initialize private field id
		public instantInnerClassSample(int id) {
			this.id = id;		
		}
		// top class method 
		public void call(){			
			// this method initialize object of innerClass and use it to call its method
			// the object of InnerClass has access to its methods
			// this method is used to call InnerClass Methods
			InnerClass innerClass = new InnerClass();
			innerClass.callInner(id);
			
//			class InnerClass2(){}
			
//			System.out.println("Starting robot " + id);
			
		}
	

}
