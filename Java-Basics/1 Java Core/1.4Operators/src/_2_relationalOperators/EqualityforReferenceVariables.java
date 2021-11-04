package _2_relationalOperators;
import javax.swing.JButton;

public class EqualityforReferenceVariables {
	/**
	    This code creates three reference variables. The first two, a and b, are separate
		JButton objects that happen to have the same label. The third reference variable, c,
		is initialized to refer to the same object that a refers to.
		
	 */
	public static void main(String[] args) {
		JButton a = new JButton("Exit");
		JButton b = new JButton("Exit");
		JButton c = a;
		
		
		
		System.out.println("Is reference a == b? " + (a == b)); 	// print false - two can't compare object with ==
		
		System.out.println("Is reference a == b? " + (a.equals(b)));
		
		System.out.println("Is reference a == c? " + (a == c)); 	// print true - here you compare references not objects
		
		System.out.println("Is reference a == c? " + (a.equals(c)));

		b = a;
		
		System.out.println("Is reference a == b? " + (a == b)); 
	}

}
