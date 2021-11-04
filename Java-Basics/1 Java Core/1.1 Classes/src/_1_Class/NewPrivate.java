package _1_Class;

/**
 * @author Marcin
 *
 * class cannot be marked as private
 * Only inner classes can be private
 */
public class NewPrivate {

	public static void main(String[]args){
		
		Holder h = new Holder();
		h.n.printSomething();		
	}
	
}
class Holder{	
	
	New n = new New();
	
	 class New{	
		
		void printSomething(){
			System.out.println("I am new");
		}
		
		
		
		
		
	}
	
	
}

