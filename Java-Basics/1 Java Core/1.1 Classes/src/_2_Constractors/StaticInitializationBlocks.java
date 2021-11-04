package _2_Constractors;

public class StaticInitializationBlocks {

	public static void main(String[] args) {

		Class1 cl = new Class1(45);
		System.out.println("a = " + cl.getA());
	}

}


class Class1{
	
	int a = 23;
	int b;
	int c;
	
	
	// this is static block which runs after fields initialization but before constructors
	{ 
		b = 34;
		System.out.println("b = " + b );
		System.out.println("c = " + c );
	}


	public Class1(int c) {
		
		this.c = c;
		System.out.println("c = " + c);
	}
	
	public int getA() {
		return a;
	}
	
	
	
	
	
	
	
	
	
	
}