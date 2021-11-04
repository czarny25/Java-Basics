package _6_garbageCollection;

public class NullingAReference {
	public static void main(String[] args) {
		
		StringBuffer sb1 = new StringBuffer("hello");
		
		StringBuffer sb2 = new StringBuffer("goodbye");
		System.out.println(sb1);
		 
					// The StringBuffer s1 object is not eligible for collection
		
		sb1 = null;  // Now the StringBuffer s1 object is eligible for collection
		
		// by redirecting sb reference to null the object from line 6 has no 
		// reference and can be taken out
	
		System.out.println(sb2);// The StringBuffer s2 object is not eligible for collection
		
		sb2 = sb1; // Now the StringBuffer s1 object is eligible for collection
		
		// by redirecting sb2 reference to sb1 witch was null the object from line 8 has no 
		// reference and can be taken out
		
		System.out.println(sb1);
		System.out.println(sb2);
	}

}
