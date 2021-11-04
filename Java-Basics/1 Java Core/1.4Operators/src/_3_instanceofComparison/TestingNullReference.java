package _3_instanceofComparison;

public class TestingNullReference {

	/**
	 *  it is legal to test whether the null reference is an instance of a class.
		This will always result in false, of course
	 */
	public static void main(String[] args) {
		
		String a = null;
		
		boolean b = null instanceof String;
		
		boolean c = a instanceof String;
		
		System.out.println(b + " " + c);
		
	}

}
