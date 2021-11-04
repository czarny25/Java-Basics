package _2_declareClassess;

/**
 * This class has completely different purpose.
 * It can only be inherited but you can't make  
 * an object of it
 * But they can be compiled and run
 */

public abstract class AbstractClass {
	public static void main(String[] args) {
		System.out.println("Abstract dziala");
	}

}

class GoodTry{
	
//	AbstractClass ac = new AbstractClass(); // this will cause compiler error
	
}