package _1_compoundAssignmentOperators;
public class Example1 {
	/**
	 * 
	 */
	public static void main(String[] args) {
		
		int y = 2;
		int x = 5;
		
		y = y - 6;
		x = x + 2 * 5;
		
		//Now, with compound operators:
		y -= 6;
		x += 2 * 5;
		//The last two assignments give the same result as the first two.
		
		y = y * 6;
		x *= 5;
		
		y = y / 6;
		x /= 5;
		
		/** also you have to remember that when using a compound operator, the expression
		on the right side of the = will always be evaluated first.
		see example:
		*/		
			x *= 2 + 5;
			
			//to be evaluated like this:
			
			x = (x * 2) + 5; // incorrect precedence
			
			// it is evaluated like this:
			x = x * (2 + 5);
		
	}

}
