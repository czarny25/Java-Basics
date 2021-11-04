package _7_InnerClasses;

public class muClass {
    public static void main(String[] args) {
        
    	Outer objRef = new Outer(23);

//		Inner tmp = objRef.createInner();
		
//		int secret = tmp.getSecret();
//	   System.out.println( secret );

	   System.out.println(objRef.createInner().getSecret());
    }
}

	class Outer {
	    private int secret;
	    
	    Outer(int secret) { 
	    	this.secret = secret; 
	    }
	
		    class Inner {
		        int getSecret() { 		        	
		        	return secret; }
		
		    }
	
	    Inner createInner() { 
	    	return new Inner(); 
	    }


}
