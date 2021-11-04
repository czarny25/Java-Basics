package _2_Constractors;

public class PrivateConstructors {

	public static void main(String[] args) {
		
		ClassTest ct = new ClassTest(3, 6);
		System.out.println("a = " + ct.getA() + ", b = " + ct.getB() + ", c = "+ ct.getC() + ", d = " + ct.getD());
		
	}

	
	
}



class ClassTest{
	
	int a;
	int b;
	int c;
	double d;
	
	
	
	public ClassTest(int a) {
		this(23, 34, 56);
//		this(35.9);
		this.a = a;
		System.out.println("Const 1");
	}
	
	
	public ClassTest(int a, int b) {
		
		this(a);
		this.b = b;
		System.out.println("Const 2");

	}

	private ClassTest(int a, int b, int c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
		System.out.println("Const 3");

	}
	
	
	private ClassTest(double d) {		
		this.d = d;
		System.out.println("Const 4");

	}


	public int getA() {
		return a;
	}


	public int getB() {
		return b;
	}


	public int getC() {
		return c;
	}


	public double getD() {
		return d;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}