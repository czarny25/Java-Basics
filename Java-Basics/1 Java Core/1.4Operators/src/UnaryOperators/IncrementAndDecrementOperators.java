package UnaryOperators;

public class IncrementAndDecrementOperators {

	/**
	 	they are also called UNARY operators
	 	
	    These operators are composed of either two plus signs (++) or two minus signs (--):
		■ ++ increment (prefix and postfix)
		■ -- decrement (prefix and postfix)
	 */
	public static void main(String[] args) {
		
		int x = 2; 
		int y = 3;
		
		if ((y == x++) | (x < ++y)) {
			System.out.println("x = " + x + "\ny = " + y);
		}

	}

}
