package Nested;

public class muClass {
    public static void main(String[] args) {
        
    	Zewnatrz objRef = new Zewnatrz(23);

//		Inner tmp = objRef.createInner();
		
//		int secret = tmp.getSecret();
//	   System.out.println( secret );

	   System.out.println(objRef.createInner().getSecret());
    }
}

	class Zewnatrz {
	    private int secret;
	    
	    Zewnatrz(int secret) { 
	    	this.secret = secret; 
	    }
	
		    class Wewnatrz {
		        int getSecret() { 		        	
		        	return secret; }
		
		    }
	
		    Wewnatrz createInner() { 
	    	return new Wewnatrz(); 
	    }


}
