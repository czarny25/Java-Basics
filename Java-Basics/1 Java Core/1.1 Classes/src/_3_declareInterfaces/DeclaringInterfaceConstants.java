package _3_declareInterfaces;


public interface DeclaringInterfaceConstants { // interface by default are fully abstract
											   // you have to make your interface public 
											   // to allow others to use it	
											   // interface can only be public or default
	
	// below are interface constants which are by default are final 
	// and there is no way to change them
	
	int num = 34;
	String name = "Maria";
	int[]nums = new int[4];
	
	public static int x = 1;        // Doesn't show final
	public final int y = 1;         // Doesn't show static
	static final int z = 1;          // Doesn't show public
	public static final int f = 1;  // what you get implicitly
	
	int takeNum(int num);
	
}
