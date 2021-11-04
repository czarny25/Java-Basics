package _3_declareInterfaces;

public class DeclaringInterface {
	/**
	 * This class will declare typical interface Bounceable
	 */
	public static void main(String[] args) {
		

	}
}
 	// two different interface declaration

abstract interface BounceableII {
	
	public abstract void bounce();
	public abstract void setBounceFactor(int bf);
}
/**
 * Interface are abstract by default so work well whit out abstract too
 * 
 * methods also are public and abstract by default and the form below is 
 * good enough
 */
interface Bounceable {
	
	void bounce();
	void setBounceFactor(int bf);
	
	// this is valid declaration
	abstract public void bounce2();
}

