package _3_ParametersInTheMethod;

public class FinalMethods {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FinalMethods f = new FinalMethods();
		f.AmIfinal();
	}
	
	public final void AmIfinal(){
		
	}
	
	
}

class Subclass extends FinalMethods {
	
	
	// This method won't compile  
	
	public final void AmIfinal(){
		
	}
	
}