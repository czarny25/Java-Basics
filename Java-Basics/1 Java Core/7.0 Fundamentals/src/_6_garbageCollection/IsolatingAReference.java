package _6_garbageCollection;

public class IsolatingAReference {
	
	IsolatingAReference i;
	
	public static void main(String[] args) {
		
		IsolatingAReference i2 = new IsolatingAReference();
		IsolatingAReference i3 = new IsolatingAReference();
		IsolatingAReference i4 = new IsolatingAReference();
		
		i2.i = i3; // i2 refers to i3
		i3.i = i4; // i3 refers to i4
		i4.i = i2; // i4 refers to i2
		
		i2 = null;
		i3 = null;
		i4 = null;

	}

}
