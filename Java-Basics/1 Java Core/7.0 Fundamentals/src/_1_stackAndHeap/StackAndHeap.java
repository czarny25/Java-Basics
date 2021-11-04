package _1_stackAndHeap;

class Collar { }

public class StackAndHeap {
	
	Collar c; 				// instance variable
	String name; 	// instance variable
	
	public static void main(String[] args) {
		
		StackAndHeap  d;    // local variable: d
		d = new StackAndHeap();
		d.go(d);
		}
		 void go(StackAndHeap dog) {    // local variable: dog
		 c = new Collar();
		 dog.setName("Aiko");
		 }
		 void setName(String dogName) { // local var: dogName
		 name = dogName;
		 								// do more stuff
		

	}

}
