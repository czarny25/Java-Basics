package _7_InnerClasses;


public class SubNested extends SuperNested{

	int age = 22;
	
	private class Outer1 { // Inner class can inherit from top level class

		Outer1(){
			age -= 4;
		}
		void CallMe(){
			System.out.println("Outer1 From super was Called aged " + age);
		}			
		private class Inner1 extends Outer1 {
			Inner1(){
				age -= 9;
			}				
			void CallMe(){
				System.out.println("Inner1 From super was Called aged " + age);
			}				
		}
	}
		
	void CallMe(){
		super.CallMe();
		System.out.println("SuperNested was Called aged " + age);
				
		Outer1 o1 = new Outer1();
		o1.CallMe();
		
		Outer1.Inner1 io1 = o1.new Inner1();
		io1.CallMe();
		
		System.out.println("SuperNested was Called aged " + age);
	}
		
	
	
}
