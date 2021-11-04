package Assertion;

public class Asserty {
	private  String msg = "init";

	public static void main(String[] args) {
		
		Asserty s = new Asserty();
		s.doAssert();
		System.out.println(s.msg);
	}
	
	private void doAssert(){
		int i = 100;
		try{
			assert (i < -1): msg = msg + "\nInterest rate is negative ";
		}catch (AssertionError ae){
			msg = msg + "\nYou should NEVER catch an AssertionError";
		}		
	}


}
