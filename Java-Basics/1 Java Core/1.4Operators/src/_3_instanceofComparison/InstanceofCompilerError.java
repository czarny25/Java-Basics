package _3_instanceofComparison;


/**
 * You can't use the instanceof operator to test across two different class hierarchies
 */
class Cat{}

public class InstanceofCompilerError {

	public static void main(String[] args) {
		
		InstanceofCompilerError d = new InstanceofCompilerError();
//		
//		System.out.println(d instanceof Cat); // this will cause compiler error

	}

}
